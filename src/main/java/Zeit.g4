lexer grammar Zeit;

// Token definitions

TIME: STUNDEN SEPERATOR MINUTEN_ODER_SEKUNDEN | (STUNDEN SEPERATOR MINUTEN_ODER_SEKUNDEN SEPERATOR MINUTEN_ODER_SEKUNDEN);


// Regular expressions used in token definitions
fragment STUNDEN: [0-2][0-9];
fragment MINUTEN_ODER_SEKUNDEN: [0-5][0-9];
fragment SEPERATOR: ':';


//Schneide zu Zeit ab
OTHER : .TIME* -> skip;

WHITESPACE : [ \t\r\n]+ ->skip ;














