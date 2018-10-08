grammar ClassLayout;
//see sample.u2c to see how all this fits together

//Parser Rules

u2cFile : classHeading body EOF ;

body : (attribute | constructor | method | getset)* ;

//class heading
classHeading : modifiers Name superClass? Newline ;
superClass : Seperator Name ;

//attributes
attribute : modifiers variable Name defaultValue? Newline ;
defaultValue : ValueAssignment Value ;

//constructors
constructor : modifiers (DefaultKeyword | (constructorParameter (ParamaterSeperator constructorParameter)*)?) Newline ;
constructorParameter : variableReference? variable? Name ;

//methods and getters and setters
method : modifiers Name methodParameter* methodReturnType? Newline ;
methodReturnType : ParamaterSeperator ReturnSpecifier Name ;
methodParameter : ParamaterSeperator (Name Seperator)? Name ;
getset : (GetKeyword | SetKeyword) Seperator (AllKeyword | Name) Newline ;

//used in multple sections
modifiers : AccessModifier? staticModifier? finalModifier? ;
staticModifier : StaticModifier Seperator ;
finalModifier : FinalModifier Seperator ;
variable : Name Seperator ;
variableReference : Name Seperator Seperator ;

//Lexer Rules

fragment Lowercase : [a-z] ;
fragment Uppercase : [A-Z] ;
fragment Digit : [0-9] ;

AccessModifier : ('-'|'#'|'+') ;

StaticModifier : 's' ;
FinalModifier : 'f' ;

Seperator : ':' ;
ReturnSpecifier : '>' ;
ParamaterSeperator : ',' ;
ValueAssignment : '=' ;

DefaultKeyword : 'default' ;
GetKeyword : 'get' ;
SetKeyword : 'set' ;
AllKeyword : 'all' ;

Name : (Lowercase | Uppercase | '_') (Lowercase | Uppercase | Digit | '_')* ;

Value : (Digit+ ('.' Digit+)?) | ('\'' .*? '\'');

Newline : ('\r'? '\n' | '\r')+ ;
Comment : ('//' .*? Newline) -> skip ;
Whitespace : (' '|'\t') -> skip ;
