grammar L;

@header {
}

program: block EOF;

block: LeftFigureBrace statements RightFigureBrace;
statements: | statement | block | statement statements | block statements;
statement: functionCall Semicolon | assignment Semicolon | whileStatement Semicolon | ifstatement Semicolon;
ifstatement: If LeftBrace conditionStatement RightBrace Then block | If LeftBrace conditionStatement RightBrace Then block Else block ;
assignment: ident AS conditionStatement | ident AS expression;
whileStatement: While LeftBrace conditionStatement RightBrace block;
conditionStatement: True | False | expression comp expression;
functionCall: ident LeftBrace expressions RightBrace;
comp: EQ | NEQ | G | GE | L | LE;

expressions: expression | expression Comma expressions;
expression: p;

p: m | p PLUS m | p MINUS m;
m: u | m MULT u | m DIV u;
u: MINUS u | z;
z: number | ident | LeftBrace p RightBrace;

number: r_integer | r_float;

digit: Zero | PositiveDigit;
digitsAndUnderscores: (digit | Underscore)*;
digits: digit | digit digitsAndUnderscores digit;
r_integer: Zero | PositiveDigit digitsAndUnderscores;
signedInteger: Sign r_integer | r_integer;
exp: E signedInteger;
r_float: (r_integer)? Dot (digits)? (exp)?
    |(r_integer)* Dot digits
    | r_integer exp?;
ident: (Underscore| Letter)(Underscore| Letter | digit)*;

PositiveDigit: '1'..'9';
Underscore: '_';

Letter: 'a'..'z';
LineTerminator: '\r'|'\n'|'\r\n';

Zero: '0';
Sign: '+' | '-';
E: 'e' | 'E';

Dot: '.';
Comma: ',';
LeftBrace: '(';
RightBrace: ')';
LeftFigureBrace: '{';
RightFigureBrace: '}';
Semicolon: ';';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
REM: '%';
EQ: '==';
NEQ: '!=';
G: '>';
GE: '>=';
L: '<';
LE: '<=';
AND: '&&';
OR: '||';
AS: ':=';

If: 'if';
Then: 'then';
Else: 'else';
While: 'while';

True: 'true';
False: 'false';

Comment: '//'(~('\r'|'\n'))* -> skip;
WhiteSpace: (LineTerminator |' '|'\t'|'\f') -> skip;





