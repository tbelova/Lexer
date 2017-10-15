package ru.spbau;

%%
%class MyLexer
%unicode
%type Token
%line
%column

positiveDigit = [1-9]
digit = 0|{positiveDigit}
digitsAndUnderscores = ({digit}|"_")*
digits = {digit}|{digit}{digitsAndUnderscores}{digit}

letter = [a-z]

lineTerminator = \r|\n|\r\n
whiteSpace = {lineTerminator}|[ \t\f]

ident = ("_"|{letter})(_|{letter}|digit)*
comment = "//"[^\r\n]*

//integer = ("+"|"-")?(0|{positiveDigit}({digit})*)
integer = ("+"|"-")?(0|{positiveDigit}{digitsAndUnderscores})
exp = (e|E){integer}
float = {integer}*"."({digits})?({exp})+ |{integer}*"."{digits} |{integer}{exp}?

%{
    private int yyline = 0;
    private int yycolumn = 0;

    @org.jetbrains.annotations.NotNull Position getPosition() {
        return new Position(yyline, yycolumn, yycolumn + yytext().length() - 1);
    }
%}

%%

{whiteSpace} {}
{comment}    {return new Commentary(getPosition());}

{integer}    {return new Int(yytext().toString(), getPosition());}
{float}      {return new Float(yytext().toString(), getPosition());}

if           {return new KeyWord(KeyWordType.IF, getPosition());}
then         {return new KeyWord(KeyWordType.THEN, getPosition());}
else         {return new KeyWord(KeyWordType.ELSE, getPosition());}
while        {return new KeyWord(KeyWordType.WHILE, getPosition());}
do           {return new KeyWord(KeyWordType.DO, getPosition());}
read         {return new KeyWord(KeyWordType.READ, getPosition());}
write        {return new KeyWord(KeyWordType.WRITE, getPosition());}
begin        {return new KeyWord(KeyWordType.BEGIN, getPosition());}
end          {return new KeyWord(KeyWordType.END, getPosition());}

true         {return new Bool(yytext().toString(), getPosition());}
false        {return new Bool(yytext().toString(), getPosition());}

"+"          {return new Operator(OperatorType.PLUS, getPosition());}
"-"          {return new Operator(OperatorType.MINUS, getPosition());}
"*"          {return new Operator(OperatorType.MULT, getPosition());}
"/"          {return new Operator(OperatorType.DIV, getPosition());}
"%"          {return new Operator(OperatorType.REM, getPosition());}
"=="          {return new Operator(OperatorType.EQ, getPosition());}
"!="         {return new Operator(OperatorType.NEQ, getPosition());}
">"          {return new Operator(OperatorType.G, getPosition());}
">="         {return new Operator(OperatorType.GE, getPosition());}
"<"          {return new Operator(OperatorType.L, getPosition());}
"<="         {return new Operator(OperatorType.LE, getPosition());}
"&&"         {return new Operator(OperatorType.AND, getPosition());}
"||"         {return new Operator(OperatorType.OR, getPosition());}

"("          {return new LeftParenthesis(getPosition());}
")"          {return new RightParenthesis(getPosition());}

";"          {return new Semicolon(getPosition());}

{ident}      {return new Identifier(yytext().toString(), getPosition());}

[^]     { throw new ParseErrorException(); }

