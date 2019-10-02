lexer grammar Zeit;

// Token definitions

TIME: TIMEUNIT SEPERATOR TIMEUNIT | (TIMEUNIT SEPERATOR TIMEUNIT SEPERATOR TIMEUNIT);


// Regular expressions used in token definitions
fragment DIGIT: [0-9];
fragment TIMEUNIT: DIGIT DIGIT;
fragment SEPERATOR: ':';



OTHER : .TIME* -> skip;
//WHITESPACE : [ \t\r\n]+ ->skip ;



/*grammar Zeit;


zeit: (einheit SEPERATOR einheit) | (einheit SEPERATOR einheit SEPERATOR einheit);

einheit: DIGIT DIGIT;

SEPERATOR: ':';

DIGIT: [0-9];

//OTHER : . -> skip;







/*zeit: STUNDEN ':' MINUTEN;

STUNDEN: [0-2][0-9];

MINUTEN: [0-5][0-9];

SEPERATOR: ':';

DIGIT: [0-9];*/










