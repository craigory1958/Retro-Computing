 

grammar Directives ;

options { 
	caseInsensitive = true;	
}

import Expressions ;


directive:  definedDirective | macroDirective | macroInvocation ;
definedDirective:  '.' DefinedDirectives argumentList? ;
macroDirective: symbol '.macro' parameterList? ;
macroInvocation: '.' symbol argumentList? ;

label:  Identifier ;
symbol:  Identifier ;


argumentList:   argument ( ',' argumentList )? ; 
argument:  expr ;

parameterList:   ( annotatedParameter | parameter ) ( ',' parameterList )? ; 
annotatedParameter: ParameterAnnotations symbol paramaterDefault? ;
parameter: symbol paramaterDefault? ;

paramaterDefault:  '=' expr ;


ParameterAnnotations: ':' | '.' ;

DefinedDirectives:  'equ' | 'include' | 'org' ;
