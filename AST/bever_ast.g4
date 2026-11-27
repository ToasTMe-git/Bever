grammer bever_g4;

prog: command + EOF;
command : ;

block: '{' command* '}';

class_decl: 'class' ID block;

main_dection: 

/*
main: {

}

*/

ID : [a-zA-Z][a-zA-Z0-9_]*;
FLOAT : [0-9]+ '.' [0-9]+;
NUM   : [0-9]+;
COMMENT : '#' ~[\r\n]* -> skip;
STRING : '"' ~[\r\n"]* '"'
       | '\'' ~[\r\n']* '\''
       ;

WS : [ \t\r\n]+ -> skip;
