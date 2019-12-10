/**
 * Define a grammar called Hello
 */
grammar RevesParser;
import Reves;

/*
 * op
 */
//DEFINIR NO MAS 

program: PROGRAM ID BRACKET_OPEN 
	(sentence* | operation*)
BRACKET_CLOSE;

sentence: var_decl | var_assingn | nltnirp | fi | rof | elihw | esle ;

var_decl: VAR ID SEMICOLON;
var_assingn :(NUMBER|ID) ASSIGN ID SEMICOLON;
nltnirp: (NUMBER|ID) PRINTLN SEMICOLON;
rof: FOR_RW var_assingn condicion (NUMBER | VAR) SEMICOLON ID ASSIGN ID PLUS NUMBER BRACKET_OPEN (sentence* | operation*) BRACKET_CLOSE;
fi: IF_RW PAR_OPEN  condicion (ID | NUMBER ) PAR_CLOSE BRACKET_OPEN (sentence* | operation*) BRACKET_CLOSE;
esle: ELSE_RW PAR_OPEN  condicion (ID | NUMBER ) PAR_CLOSE BRACKET_OPEN (sentence* | operation*) BRACKET_CLOSE;
elihw: WHILE_RW PAR_OPEN  condicion (ID | NUMBER ) PAR_CLOSE BRACKET_OPEN (sentence* | operation*) BRACKET_CLOSE;
condicion: ID (GT | LT | NEQ | GEQ | LEQ | EQ );

operation: (NUMBER | ID) (MINUS | MULT | DIV | PLUS | EXP) (NUMBER| ID) ASSIGN ID SEMICOLON;