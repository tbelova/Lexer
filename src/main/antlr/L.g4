grammar L;

program: statements EOF;

block: LeftFigureBrace statements RightFigureBrace;
statements: | function | statement | block | function statements | statement statements | block statements;
statement: functionCall Semicolon | assignment Semicolon | whileStatement | ifstatement | returnStatement Semicolon | readStatement Semicolon | writeStatement Semicolon | expression Semicolon;
ifstatement: If LeftBrace booleanExpression RightBrace Then thenStatement | If LeftBrace booleanExpression RightBrace Then thenStatement Else elseStatement;
readStatement: Read ident;
writeStatement: Write expression;
assignment: ident AS expression | ident AS booleanExpression;
whileStatement: While LeftBrace booleanExpression RightBrace Do block;
thenStatement: block;
elseStatement: block;
function: ident LeftBrace idents RightBrace block;
functionCall: ident LeftBrace expressions RightBrace;

booleanExpression: a;

a: b | r_or = a OR b;
b: c | r_and = b AND c;
c: d | r_eq = c EQ d | r_neq = c NEQ d | r_g = c G d | r_ge = c GE d | r_l = c L d | r_le = c LE d;
d: expression | True | False | LeftBrace d RightBrace;

eq: EQ;
neq: NEQ;
g: G;
ge: GE;
l: L;
le: LE;

returnStatement: Return | Return expression | Return booleanExpression;

expressions: expression | expression Comma expressions;
expression: p;

idents: ident | ident Comma idents;

p: m | sum = p PLUS m | sub = p MINUS m;
m: u | mult = m MULT u | div = m DIV u | rem = m REM u;
u: unary_minus = MINUS u | z;
z: smth | LeftBrace p RightBrace;

smth: number | ident | functionCall;

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
GE: '>=';
G: '>';
LE: '<=';
L: '<';
AND: '&&';
OR: '||';
AS: ':=';

If: 'if';
Then: 'then';
Else: 'else';
While: 'while';
Write: 'write';
Read: 'read';
Do: 'do';

Return: 'return';

True: 'true';
False: 'false';

Zero: '0';
Sign: '+' | '-';
E: 'e' | 'E';

Comment: '//'(~('\r'|'\n'))* -> skip;
LineTerminator: ('\r'|'\n'|'\r\n') -> skip;
WhiteSpace: (' '|'\t'|'\f') -> skip;





