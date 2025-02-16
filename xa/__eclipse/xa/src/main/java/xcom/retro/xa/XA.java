

package xcom.retro.xa ;


import static xcom.retro.xa.XA.AssemblyPhases.Assemble ;
import static xcom.retro.xa.XA.AssemblyPhases.Extrude ;
import static xcom.retro.xa.XA.AssemblyPhases.Generate ;
import static xcom.retro.xa.XA.AssemblyPhases.Init ;
import static xcom.retro.xa.XA.AssemblyPhases.List ;
import static xcom.retro.xa.XA.AssemblyPhases.Parse ;
import static xcom.utils4j.logging.Loggers.ConsoleLoggerName ;

import java.io.File ;
import java.io.FileWriter ;
import java.io.IOException ;
import java.io.PrintWriter ;
import java.lang.annotation.Annotation ;
import java.nio.charset.Charset ;
import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;
import java.util.Map.Entry ;
import java.util.Properties ;
import java.util.Set ;
import java.util.Stack ;

import org.antlr.v4.runtime.CharStream ;
import org.antlr.v4.runtime.CharStreams ;
import org.antlr.v4.runtime.CommonTokenStream ;
import org.antlr.v4.runtime.Lexer ;
import org.antlr.v4.runtime.Parser ;
import org.antlr.v4.runtime.ParserRuleContext ;
import org.antlr.v4.runtime.TokenStream ;
import org.antlr.v4.runtime.tree.ParseTreeListener ;
import org.antlr.v4.runtime.tree.ParseTreeWalker ;
import org.apache.commons.cli.CommandLine ;
import org.apache.commons.cli.DefaultParser ;
import org.apache.commons.cli.HelpFormatter ;
import org.apache.commons.cli.Option ;
import org.apache.commons.cli.Options ;
import org.apache.commons.cli.ParseException ;
import org.apache.commons.io.FileUtils ;
import org.apache.commons.io.FilenameUtils ;
import org.apache.commons.lang3.StringUtils ;
import org.fest.reflect.core.Reflection ;
import org.reflections.Reflections ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import xcom.retro.xa.api.annotations.aDirective ;
import xcom.retro.xa.api.annotations.aExtruder ;
import xcom.retro.xa.api.annotations.aProcessor ;
import xcom.retro.xa.api.interfaces.iDirective ;
import xcom.retro.xa.api.interfaces.iExtruder ;
import xcom.retro.xa.api.interfaces.iProcessor ;
import xcom.retro.xa.api.interfaces.iSource ;
import xcom.retro.xa.directives.dir.MACRO ;
import xcom.retro.xa.directives.dir.STRUCT ;
import xcom.utils4j.logging.aspects.api.annotations.Log ;
import xcom.utils4j.resources.Props ;


public class XA {

	public enum AssemblyPhases {
		Init, Parse, Assemble, Generate, Extrude, List;
	}


	public class AssemblyContext {

		//@formatter:off

		CommandLine cmd ;

		Map<String, String> cmdArgs ;
		public Map<String, String> cmdArgs() { return cmdArgs ; }

		Map<String, iDirective> directives ;
		public Map<String, iDirective> directives() { return directives ; }
		
		Stack<Boolean> ifBlocks ;
		public Stack<Boolean> ifBlocks() { return ifBlocks ; }

		boolean list ;
		public boolean list() { return list ; }
		public AssemblyContext list(final boolean list) {
			this.list = list ;
			return this ;
		}

		Map<String, MACRO> macros = new HashMap<>() ;
		public Map<String, MACRO> macros() { return macros ; }

		AssemblyPhases phase ;
		public AssemblyPhases phase() { return phase ; }

		Segment segment ;
		public Segment segment() { return segment ; }
		public AssemblyContext segment(final Segment segment) {
			this.segment = segment ;
			return this ;
		}

		Map<String, Segment> segments = new HashMap<>() ;
		public Map<String, Segment> segments() { return segments ; }

		Stack<iSource> source = new Stack<>() ;
		public Stack<iSource> source() { return source ; }

		List<iSource> sources = new ArrayList<>() ;
		public List<iSource> sources() { return sources ; }

		Statement statement ;
		public Statement statement() { return statement ; }
		public AssemblyContext statement(final Statement statement) {
			this.statement = statement ;
			return this ;
		}

		List<Statement> statements = new ArrayList<>() ;
		public List<Statement> statements() { return statements ; }

		Map<String, STRUCT> structs = new HashMap<>() ;
		public Map<String, STRUCT> structs() { return structs ; }

		Symbol symbol ;
		public Symbol symbol() { return symbol ; }
		public AssemblyContext symbol(final Symbol symbol) {
			this.symbol = symbol ;
			return this ;
		}

		Map<String, Symbol> symbols = new HashMap<>() ;
		public Map<String, Symbol> symbols() { return symbols ; }

		//@formatter:on


		public AssemblyContext() {

			list = true ;
			ifBlocks = new Stack<>() ;
			ifBlocks.push(true) ;
		}


		public boolean assembleEnable() {
			return ifBlocks.peek() ;
		}

	}


	private static final Logger Logger = LoggerFactory.getLogger(XA.class) ;
	private static final Logger Console = LoggerFactory.getLogger(ConsoleLoggerName) ;
	private static final String AppName = XA.class.getSimpleName() ;


	/**
	 * The valid command line options.
	 */
	static final String CommandLineOption_Help = "h" ;
	static final String CommandLineOptionLong_Help = "help" ;
	static final String CommandLineOption_Version = "v" ;
	static final String CommandLineOptionLong_Version = "version" ;
	static final String CommandLineOption_Bin = "b" ;
	static final String CommandLineOption_Format = "f" ;
	static final String CommandLineOption_List = "l" ;
	static final String CommandLineOption_Processor = "p" ;
	static final String CommandLineOptionLong_Processor = "processor" ;

	static final Options CommandLineOptions = new Options() ;

	static {
		CommandLineOptions.addOption(Option.builder(CommandLineOption_Help).longOpt(CommandLineOptionLong_Help).desc("display this message").build()) ;
		CommandLineOptions
				.addOption(Option.builder(CommandLineOption_Version).longOpt(CommandLineOptionLong_Version).desc("display version information").build()) ;

		CommandLineOptions
				.addOption(Option.builder(CommandLineOption_Bin).argName("file").hasArg().optionalArg(true).desc("generate assembly binary").build()) ;
		CommandLineOptions.addOption(Option.builder(CommandLineOption_Format).argName("format").hasArg().optionalArg(true).desc("binray format").build()) ;
		CommandLineOptions
				.addOption(Option.builder(CommandLineOption_List).argName("file").hasArg().optionalArg(true).desc("generate assembly listing").build()) ;
		CommandLineOptions.addOption(
				Option.builder(CommandLineOption_Processor).longOpt(CommandLineOptionLong_Processor).argName("processor").hasArg().desc("processor").build()) ;
	}


	Properties props ;
	AssemblyContext actx ;

	Lexer lexer ;
	Parser parser ;
	iExtruder extruder ;
	Map<String, Class<Class<? extends iExtruder>>> extruders ;
	iExtruder lister ;
	ParseTreeListener processor ;
	Map<String, Class<Class<? extends iProcessor>>> processors ;


	public XA() {
		actx = new AssemblyContext() ;
	}


	@Log
	XA init() throws Exception {

		actx.phase = Init ;

		{
			final Annotation processor = processors.get(actx.cmdArgs.get(CommandLineOption_Processor)).getAnnotations()[0] ;

			final String lexerClassname = processor.getClass().getMethod("lexar").invoke(processor).toString().substring(6) ;
			final Class<? extends Lexer> lexerClass = Reflection.type(lexerClassname).loadAs(Lexer.class) ;
			lexer = Reflection.constructor().withParameterTypes(CharStream.class).in(lexerClass).newInstance(CharStreams.fromString("")) ;

			final String parserClassname = processor.getClass().getMethod("parser").invoke(processor).toString().substring(6) ;
			final Class<? extends Parser> parserClass = Reflection.type(parserClassname).loadAs(Parser.class) ;
			parser = Reflection.constructor().withParameterTypes(TokenStream.class).in(parserClass).newInstance(new CommonTokenStream(lexer)) ;

			final String listenerClassname = processors.get(actx.cmdArgs.get(CommandLineOption_Processor)).getName() ;
			final Class<? extends ParseTreeListener> listenerClass = Reflection.type(listenerClassname).loadAs(ParseTreeListener.class) ;
			this.processor = Reflection.constructor().withParameterTypes(AssemblyContext.class).in(listenerClass).newInstance(actx) ;
		}

		{
			final String extruderClassname = extruders.get(actx.cmdArgs.get(CommandLineOption_Format)).getName() ;
			final Class<? extends iExtruder> extruderClass = Reflection.type(extruderClassname).loadAs(iExtruder.class) ;
			extruder = Reflection.constructor().in(extruderClass).newInstance() ;
		}

		{
			final String extruderClassname = extruders.get("Lister").getName() ;
			final Class<? extends iExtruder> extruderClass = Reflection.type(extruderClassname).loadAs(iExtruder.class) ;
			lister = Reflection.constructor().in(extruderClass).newInstance() ;
		}

		
		return this ;
	}


	@Log
	XA parse() throws IOException {  // Pass 1

		actx.phase = Parse ;

		actx.sources.add(new FileSource(actx.sources.size(), actx.cmdArgs.get("source"), actx.list())) ;
		actx.source.push(actx.sources.get(actx.sources.size() - 1)) ;

		actx.segments.put("<default>", new Segment("<default>")) ;
		actx.segment = actx.segments.get("<default>") ;
		final ParseTreeWalker walker = new ParseTreeWalker() ;

		while ( !actx.source.isEmpty() ) {
			
			actx.list(actx.source.peek().list()) ;
//			System.err.println(actx.list()) ;
			
			for ( String line; (line = actx.source.peek().next()) != null; ) {

				line = line.stripTrailing() ;

				actx.statements.add( //
						new Statement( //
								actx.source.peek().sn(), //
								actx.source.peek().ln(), //
								line, actx.segment.lc, //
								actx.list(), //
								actx.assembleEnable() //
						)) ;

				actx.statement = actx.statements.get(actx.statements.size() - 1) ;

				lexer.setInputStream(CharStreams.fromString(line)) ;
				parser.setTokenStream(new CommonTokenStream(lexer)) ;

				actx.statement.pctx = Reflection.method("statement").withReturnType(ParserRuleContext.class).in(parser).invoke() ;
				Console.debug(">>>{}", line) ;

				walker.walk(processor, actx.statement.pctx) ;

				if ( actx.statement.assembleEnable() ) {
					actx.statement.block = actx.segment.blocks.get(actx.segment.blocks.size() - 1) ;
				}
			}

			actx.source.pop() ;
		}

		return this ;
	}


	@Log
	XA assemble() { // Pass 2

		actx.phase = Assemble ;

		for ( final Statement statement : actx.statements ) {
			actx.statement = statement ;

			if ( actx.statement.assemblyCallbackMethod != null )
				Reflection.method(actx.statement.assemblyCallbackMethod).in(actx.statement.assemblyCallbackObject).invoke() ;
		}

		return this ;
	}


	@Log
	XA generate() throws IOException {

		actx.phase = Generate ;

		for ( final Statement statement : actx.statements ) {
			actx.statement = statement ;

			if ( actx.statement.assembleEnable() && (actx.statement.block != null) && (actx.statement.bytes != null) && (actx.statement.bytes.length > 0) )
				actx.statement.block.fillBytes(actx.statement.lc, actx.statement.bytes) ;
		}

		return this ;
	}


	@Log
	XA extrude() throws IOException {

		actx.phase = Extrude ;

		if ( actx.cmd.hasOption(CommandLineOption_Bin) )
			try ( FileWriter fileWriter = new FileWriter(actx.cmdArgs.get(CommandLineOption_Bin)); PrintWriter out = new PrintWriter(fileWriter); ) {
				extruder.extrude(out, actx) ;
			}

		Console.info("") ;
		Console.info(actx.cmdArgs.get(CommandLineOption_Bin)) ;
		Console.info(FileUtils.readFileToString(new File(actx.cmdArgs.get(CommandLineOption_Bin)), Charset.defaultCharset())) ;

		return this ;
	}


	@Log
	XA list() throws IOException {

		actx.phase = List ;

		if ( actx.cmd.hasOption(CommandLineOption_List) ) {

			try ( FileWriter fileWriter = new FileWriter(actx.cmdArgs.get(CommandLineOption_List)); PrintWriter out = new PrintWriter(fileWriter); ) {
				lister.extrude(out, actx) ;
			}

			Console.info("") ;
			Console.info(actx.cmdArgs.get(CommandLineOption_List)) ;
			Console.info(FileUtils.readFileToString(new File(actx.cmdArgs.get(CommandLineOption_List)), Charset.defaultCharset())) ;
		}

		return this ;
	}


	public static void main(final String[] args) throws Exception {

		// Parse and process command line args ...

		final CommandLine cmd = parseCommandLine(CommandLineOptions, args) ;


		if ( cmd.hasOption(CommandLineOption_Help) )
			new HelpFormatter().printHelp("xa [options] file\n options:", CommandLineOptions) ;

		else if ( cmd.hasOption(CommandLineOption_Version) )
			System.out.println("v0.0.1") ;

		else {
			final XA $ = new XA() ;
			$.actx.cmd = cmd ;

			// Load properties ...
			{
				final String rSpec = "/" + (XA.class.getPackage().toString().substring(8) + "." + AppName).replace(".", "/") + ".properties" ;
				$.props = Props.merge(XA.class, new Properties(), rSpec) ;

				Logger.debug("props: {}", $.props) ;
			}

			$.actx.cmdArgs = decodeCommandLine($.actx.cmd, $.props) ;

			{
				final String path = $.props.getProperty("xa.processor.scan.classpath") ;
				$.processors = scanAndLoadByAnnotation(path, aProcessor.class.getName(), $.processors) ;

				Logger.debug("processors: {}", $.processors) ;
			}

			{
				final String path = $.props.getProperty("xa.extruder.scan.classpath") ;
				$.extruders = scanAndLoadByAnnotation(path, aExtruder.class.getName(), $.extruders) ;

				Logger.debug("extruders: {}", $.extruders) ;
			}

			{
				final String path = $.props.getProperty("xa.directive.scan.classpath") ;
				$.actx.directives = scanAndInstantiateByAnnotation(path, aDirective.class.getName(), iDirective.class, $.actx, $.actx.directives) ;

				Logger.debug("directives: {}", $.actx.directives) ;
			}

			Console.info("\nUsage ...") ;
			for ( final Entry<String, String> arg : $.actx.cmdArgs.entrySet() )
				Console.info("    -" + arg.getKey() + " " + StringUtils.trimToEmpty(arg.getValue())) ;

			//

			$.init().parse().assemble().generate().extrude().list() ;

			Console.info("Done.") ;
		}
	}


	@SuppressWarnings("unchecked")
	static <T> Map<String, T> scanAndLoadByAnnotation(final String path, final String annotation, Map<String, T> annotations) {

		Logger.info("Scanning classpath '{}.*' for {} ...", path, annotation) ;

		if ( annotations == null )
			annotations = new HashMap<>() ;

		try {
			final Set<Class<?>> _annotations = new Reflections(path).getTypesAnnotatedWith((Class<? extends Annotation>) Class.forName(annotation)) ;
			Logger.info("found {} annotations in classpath: |{}|", _annotations.size(), _annotations) ;

			for ( final Class<?> _annotation : _annotations )
				for ( final Annotation a : _annotation.getAnnotations() )

					if ( a.annotationType().getName().equals(annotation) )
						annotations.put(_annotation.getSimpleName(), (T) _annotation) ;
		}
		catch ( IllegalArgumentException | SecurityException | ClassNotFoundException e ) {
			e.printStackTrace() ;
		}


		return annotations ;
	}


	static <T> Map<String, T> scanAndInstantiateByAnnotation(final String path, final String annotation, final Class<T> clazz, final AssemblyContext actx,
			Map<String, T> annotations) {

		Logger.info("Scanning classpath '{}.*' for {} ...", path, annotation) ;

		if ( annotations == null )
			annotations = new HashMap<>() ;

		try {
			@SuppressWarnings("unchecked")
			final Set<Class<?>> _annotations = new Reflections(path).getTypesAnnotatedWith((Class<? extends Annotation>) Class.forName(annotation)) ;
			Logger.info("found {} annotations in classpath: |{}|", _annotations.size(), _annotations) ;

			for ( final Class<?> _annotation : _annotations )
				for ( final Annotation a : _annotation.getAnnotations() )

					if ( a.annotationType().getName().equals(annotation) ) {

						final String _classname = _annotation.getName() ;
						final Class<?> _clazz = Reflection.type(_classname).loadAs(clazz) ;
						@SuppressWarnings("unchecked")
						final T _object = (T) Reflection.constructor().withParameterTypes(AssemblyContext.class).in(_clazz).newInstance(actx) ;

						annotations.put(_annotation.getSimpleName(), _object) ;
					}
		}
		catch ( IllegalArgumentException | SecurityException | ClassNotFoundException e ) {
			e.printStackTrace() ;
		}


		return annotations ;
	}


	static CommandLine parseCommandLine(final Options options, final String[] args) throws ParseException {

		final String[] _args = Arrays.copyOf(args, args.length + 1) ;
		_args[args.length - 1] = "" ;
		_args[args.length] = args[args.length - 1] ;

		Logger.debug("_args: {}", Arrays.asList(_args)) ;

		return new DefaultParser().parse(options, _args) ;
	}


	static Map<String, String> decodeCommandLine(final CommandLine cmd, final Properties props) {

		final Map<String, String> args = new HashMap<>() ;

		// Decode processor ...
		{
			String processor = StringUtils.trimToEmpty(cmd.getOptionValue(CommandLineOption_Processor)) ;

			if ( processor.isEmpty() )
				processor = props.getProperty("xa.processor.default") ;

			args.put(CommandLineOption_Processor, processor) ;
		}

		// Decode binary format ...
		{
			String format = StringUtils.trimToEmpty(cmd.getOptionValue(CommandLineOption_Format)) ;

			if ( format.isEmpty() )
				format = props.getProperty("xa.extruder.default") ;

			args.put(CommandLineOption_Format, format) ;
		}

		// Decode source file specification ....
		{
			final String srcFSpec = cmd.getArgList().get(0) ;
			final String srcDSpec = FilenameUtils.getFullPath(srcFSpec) ;
			final String srcFNSpec = FilenameUtils.getName(srcFSpec) ;
			final String srcFN = FilenameUtils.getBaseName(srcFNSpec) ;
			String srcFNExt = FilenameUtils.getExtension(srcFNSpec) ;
			final String[] srcFNParts = srcFNSpec.split("\\.") ;

			switch ( srcFNParts.length ) {

				case 1:
					srcFNExt = ".asm" ;
					break ;

				case 3:
					args.put(CommandLineOption_Processor, srcFNParts[1]) ;
					break ;
			}

			args.put("source", srcDSpec + srcFN + "." + srcFNExt) ;
		}

		// Decode binary file specification ....
		{
			if ( cmd.hasOption(CommandLineOption_Bin) ) {
				final String bin = StringUtils.trimToEmpty(cmd.getOptionValue(CommandLineOption_Bin)) ;

				if ( bin.isEmpty() ) {
					final String srcFSpec = args.get("source") ;
					final String srcDSpec = FilenameUtils.getFullPath(srcFSpec) ;
					final String srcFNSpec = FilenameUtils.getName(srcFSpec) ;
					final String[] srcFNParts = srcFNSpec.split("\\.") ;

					args.put(CommandLineOption_Bin, srcDSpec + srcFNParts[0] + ".bin") ;
				}
				else
					args.put(CommandLineOption_Bin, bin) ;
			}
		}

		// Decode listing file specification ....
		{
			if ( cmd.hasOption(CommandLineOption_List) ) {
				final String list = StringUtils.trimToEmpty(cmd.getOptionValue(CommandLineOption_List)) ;

				if ( list.isEmpty() ) {
					final String srcFSpec = args.get("source") ;
					final String srcDSpec = FilenameUtils.getFullPath(srcFSpec) ;
					final String srcFNSpec = FilenameUtils.getName(srcFSpec) ;
					final String[] srcFNParts = srcFNSpec.split("\\.") ;

					args.put(CommandLineOption_List, srcDSpec + srcFNParts[0] + ".lis") ;
				}
				else
					args.put(CommandLineOption_List, list) ;
			}
		}


		Logger.debug("args: {}", Arrays.asList(args)) ;

		return args ;
	}
}
