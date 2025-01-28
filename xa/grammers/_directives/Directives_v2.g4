 

grammar Directives ;

options { 
	caseInsensitive = true;	
}

import Expressions ;


directive:  assembler | macro | invocation ;

assembler:  '.' Directives argumentList? ;
macro:  '.macro' optionList? ;
invocation:  '.' symbol parameterList? ;


// Assembler directive ...
argumentList:   argument ( ',' argumentList )? ; 
argument:  expr ;

// Macro definition ...
optionList:   option ( ',' optionList )? ; 
option: symbol assignment? ;

// Macro invocation ...
parameterList:  ( parameter ( ',' parameterList )? ) | ( ',' parameterList? ) ; 
parameter: ( symbol assignment ) | ideogram | argument ;
assignment:  '=' ( argument | ideogram ) ;

symbol:  Directives | Identifier ;
ideogram:  '.' symbol ;


Directives:  
	'byte' | 
	'end' | 'endif' | 'endmacro' | 'equ' | 
	'if' |'ifdef' | 'ifndef' | 'include' | 
	'list' |
	'nolist' |
	'org' | 
	'page' |
	'word' ;
