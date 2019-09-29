grammar Ipadresse;

ip:  part SEPERATOR part SEPERATOR part SEPERATOR part;

part: DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT;

DIGIT: [0-9];

SEPERATOR: '.';