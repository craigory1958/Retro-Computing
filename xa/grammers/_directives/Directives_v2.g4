 

grammar Directives ;

options { 
	caseInsensitive = true;	
}

import Expressions ;


directive:  assembler | macro | invocation ;
assembler:  '.' directives argumentList? ;
macro: '.macro' optionList? ;
invocation: '.' symbol parameterList? ;

directives: Directives ;


argumentList:   argument ( ',' argumentList )? ; 
argument:  expr ;
optionList:   option ( ',' optionList )? ; 
option: symbol assignment? ;
parameterList:   parameter ( ',' parameterList )? ; 
parameter: ( symbol assignment ) | argument ;

assignment:  '=' argument ;
symbol:  Identifier ;


Directives:  
	'byte' | 
	'end' | 'endmacro' | 'equ' | 
	'include' | 
	'list' |
	'nolist' |
	'org' | 
	'page' |
	'word' ;
