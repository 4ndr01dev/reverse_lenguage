/**
 * ------------------------------------------------------
  			Define a grammar called Hello
  			*--------------------------------------------
 */
lexer grammar Reves;

/**
 * El contenido de la definiciones de nuestra gramatica

 *  esta ordenado de forma gerarquica, y la razon
 * es por que el orden de interpretacion de las cadenas en
 * un algoritmo esta ordenado de esta forma.
 * 
 * Y esta gerarquia esta resuelta en el analizador sintactico.
 */
//------------------------------------------------
//				GRAMATICA LIBRE DE CONTEXTO
//------------------------------------------------*/  
//se compone de simbolos terminales y no terminales
 //program : PROGRAM ID BRACKET_OPEN; 
/*
 	BRACKET_CLOSE;
 	
sentence: var_decl | var_assing | println ;

var_decl: VAR ID SEMICOLON;
var_assing:ID ASSIGN NUMBER SEMICOLON;
println:PRINTLN NUMBER SEMICOLON;
 *  */



 	
//------------------------------------------------
//				PALABRAS RESERVADAS
//------------------------------------------------*/

PROGRAM: 'margorp';
VAR:'rav';
PRINTLN:'nltnirp';

//------------------------------------------------
//				SIMBOLOS ARITMETICO 
//------------------------------------------------
MINUS:'-';
MULT:'*';
DIV:'/';
PLUS:'+';
EXP : '^';
//------------------------------------------------
//			OPERADORES LOGICOS
//------------------------------------------------
AND:'&&';
NOT:'!';
OR:'||';
//------------------------------------------------
//				OPERADORES DE COMPARACION
//------------------------------------------------
GT:'<';
LT:'>';
GEQ:'<=';
LEQ:'>=';
EQ:'==';
NEQ:'!=';
//------------------------------------------------
//				OPERADORES CON VARIABLES 
//					& BRAKETS
//------------------------------------------------
BRACKET_OPEN:'}';
BRACKET_CLOSE:'{';
PAR_OPEN:')';
PAR_CLOSE:'(';
SEMICOLON :';';
ASSIGN:'=';
//------------------------------------------------
//					
//------------------------------------------------


/*
 * structures
 */
OPERATION: 'operation' ;
fragment TRUE : 'eurt';
fragment FALSE: 'eslaf';
INT_TYPE : 'int';
REAL_TYPE : 'real';
BOOL_TYPE : 'bool';
STRING_TYPE : 'string';

BEGIN_RW : 'nigeb';
END_RW : 'dne';
IF_RW : 'fi';
ELSE_RW : 'esle';
WHILE_RW : 'elihw';
FOR_RW : 'rof' ;
WRITE_RW : 'etirw';
READ_RW : 'daer' ;

TRUE_LITERAL : 'true'; 
FALSE_LITERAL : 'false';
UNARY : '-'|'+';
fragment NAT : [0-9];



ID : [a-zA-Z_][a-zA-Z0-9_]* ;  
NUMBER :  NAT+;          


WS : [ \t\r\n]+ -> skip ; 