grammar bever_ast;

prog: command+ EOF;
command : TOKENS | class_decl | func_decl;

block: '{' command* '}';

class_decl: 'class' ID block;
func_decl: Access_decl ID(Param*) ':' Types '->' block;

/*
<pub stat> f(int x): int -> block

}


*/


Access_decl: '<' Access_Modifires* '>';
Access_Modifires: PUB | STAT;
Types: STRING_TYPE | INT_TYPE | FLOAT_TYPE;
Param: Types ID;



// Specil tokens:
PUB: 'pub';
STAT: 'stat';

// Types
STRING_TYPE: 'str';
INT_TYPE: 'int';
FLOAT_TYPE: 'float';

// Standard
TOKENS: ID | FLOAT | NUM | STRING;
ID : [a-zA-Z][a-zA-Z0-9_]*;
FLOAT : [0-9]+ '.' [0-9]+;
NUM   : [0-9]+;
COMMENT : '#' ~[\r\n]* -> skip;
STRING : '"' ~[\r\n"]* '"'
       | '\'' ~[\r\n']* '\''
       ;

WS : [ \t\r\n]+ -> skip;
