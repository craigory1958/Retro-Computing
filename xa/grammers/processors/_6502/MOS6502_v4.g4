

grammar MOS6502_ ;

options { 
	caseInsensitive = true ;	
}


assembly:  ( statement eol )* EOF ;
statement:  ( label | scopedLabel )? ( instruction |  directive )? ;


//
// Instructions
//

instruction:  ( branchOpcode branchAddressingMode ) | ( opcode addressingMode ) ;

branchOpcode:  BranchOpcodes ;
opcode:  Opcodes ;

branchAddressingMode:  relative ;
addressingMode:  absolute | accumulator | immediate | implied | indexedX | indexedY | indirect | zpIndirectX | zpIndirectY | relative ;

absolute:  argument ;
accumulator:  'A' ;
immediate:  '#' argument ; 
implied: ;
indexedX:  argument ',' 'X' ;
indexedY:  argument ',' 'Y' ; 
indirect:  '[' argument ']' ;
zpIndirectX:  '[' argument ',' 'X' ']' ;
zpIndirectY:  '[' argument ']' ',' 'Y' ;
relative:  argument ;


BranchOpcodes:  
	'BCC' | 'BCS' | 'BEQ' | 'BMI' | 'BNE' | 'BPL' | 'BRA' | 'BVC' | 'BVS'
	 ;

Opcodes:  
	'ADC' | 'AND' | 'ASL' | 
	'BIT' | 'BRK' |
	'CLC' | 'CLD' | 'CLI' | 'CLV' | 'CMP' | 'CPX' | 'CPY' | 
 	'DEC' | 'DEX' | 'DEY' | 
	'EOR' | 
	'INC' | 'INX' | 'INY' | 
	'JMP' | 'JSR' | 
	'LDA' | 'LDY' | 'LDX' | 'LSR' | 
	'NOP' | 
	'ORA' | 
	'PHA' | 'PHX' | 'PHY' | 'PHP' | 'PLA' | 'PLP' | 'PLY' | 
	'ROL' | 'ROR' | 'RTI' | 'RTS' | 
	'SBC' | 'SEC' | 'SED' | 'SEI' | 'STA' | 'STX' | 'STY' | 'STZ' | 
	'TAX' | 'TAY' | 'TSX' | 'TXA' | 'TXS' | 'TYA'
	;


//
// Directives
//

directive:  assembler | macro | struct | invocation ;

assembler:  '.' Directives parameterList? ;
macro:  '.' symbol  '.macro' optionList? ;
struct:  '.' symbol '.struct' optionList? ;
invocation:  qualifiedSymbol  parameterList? ;


// Macro definition ...
optionList:  option ( ',' optionList )? ; 
option:  Identifier assignment? ;

// Assembler Directive or Macro Invocation ...
parameterList:  ( parameter ( ',' parameterList )? ) | ( ',' parameterList? ) ; 
parameter:  ( identifier assignment ) | ( '.' symbol assignment ) | ( '.' symbol ) | argument ;


assignment:  '=' argument ;
argument:  expr ;

qualifiedSymbol:  ( '.' symbol ':' )* '.' symbol ;
symbol:  Identifier | Directives ;


label:  Identifier ;
scopedLabel:  '@' Identifier ;


Directives:  
	'align' | 
	'byte' | 
	'end' | 'endif' | 'endmacro' | 'endstruct' | 'equ' | 
	'if' | 'ifdef' | 'ifndef' | 'include' | 
	'list' |
	'nolist' |
	'org' | 
	'page' |
	'segment' |
	'word'   
	;


//
// Expresions
//

expr:  term ( ( binary | comparison ) term )* ;

term:  org | ( scopedIdentifier | qualifiedIdentifier | ( '.' symbol ) )  | literal | '(' expr ')' | unary term ;
org:  '*' ;


qualifiedIdentifier:  ( '.' symbol ':' )* ( identifier ':' )* identifier ;
scopedIdentifier:  '@' identifier ;
identifier:  Identifier | Directives ;


binary:  integerAdd | integerSubtract | integerMultiply | integerDivide | bitwiseShiftLeft | bitwiseShiftRight | bitwiseAnd | bitwiseOr | logicalAnd |  logicalOr ;
comparison:  equal | notEqual | lessThan | greaterThan | '<=' | '>=' ;
unary:  plus | minus | highByte | lowByte | logicalNot ;


integerAdd:  '+' ;
integerSubtract:  '-' ;
integerMultiply:  '*' ;
integerDivide:  '/' ;

bitwiseShiftLeft:  '<<' ;
bitwiseShiftRight:  '>>' ;
bitwiseAnd:  '&' ;
bitwiseOr:  '|' ;

logicalAnd:  '&&' ;
logicalOr:  '||' ;

equal:  '==' ;
notEqual:  '!=' ;
lessThan:  '<' ;
greaterThan:  '>' ;

plus:  '+' ;
minus:  '-' ;
highByte:  '<' ;
lowByte:  '>' ;
logicalNot:  '!' ;


literal:  numericLiteral | alphanumericLiteral ; 

numericLiteral:  binaryLiteral | octalLiteral | decimalLiteral | hexLiteral ; 
alphanumericLiteral:  characterLiteral | stringLiteral ; 


binaryLiteral:  BinaryLiteral ;
octalLiteral:  OctalLiteral ;
decimalLiteral:  DecimalLiteral ;
hexLiteral:  HexLiteral ;

characterLiteral:  CharacterLiteral ;
stringLiteral:  StringLiteral ;

 
BinaryLiteral:  '0b' [0-1]+ ;
OctalLiteral:  '0o' [0-7]+ ;
DecimalLiteral:  '0d'? [0-9]+ ;
HexLiteral:  ('$' | '0x') [0-9A-F]+ ;


CharacterLiteral:  '\'' ~["] ;
StringLiteral:  '"' ~["]* '"' ;

Identifier:  [A-Z_] [A-Z0-9_]* ;
IdentifierExtension:  ':  ' '.'? [A-Z_] [A-Z0-9_]* ;


//
//
//

eol:  EOL ;


Comment:  ';' ~[\r\n]* -> skip ;

EOL:  [\r\n] ;

WS:  [ \t] -> skip ;
