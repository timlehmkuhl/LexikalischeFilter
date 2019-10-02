lexer grammar Ipadresse;


// Token definitions
IP: OKTAL SEPERATOR OKTAL SEPERATOR OKTAL SEPERATOR OKTAL;

// Regular expressions used in token definitions
fragment SEPERATOR: '.';
fragment DIGIT: [0-9];
fragment OKTAL: DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT;

//Schneide zu lange IP ab
OTHER : .OKTAL* -> skip;





/*grammar Ipadresse;

ip:  part SEPERATOR part SEPERATOR part SEPERATOR part;

part: DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT;

DIGIT: [0-9];

SEPERATOR: '.';*/