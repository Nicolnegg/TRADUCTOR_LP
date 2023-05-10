grammar MiLenguaje;

//sitactico

inicio : sentenciaElse sentencia ;
sentencia: sub inicio
    | EOF ;
sentenciaElse : if sentenciaElse
    |  while sentenciaElse
    |  for sentenciaElse
    | Goto Id sentenciaElse
    | Program Tkn_period funcionContinuidad sentenciaElse
    | Stack Tkn_period funcionContinuidad sentenciaElse
    | TextWindow Tkn_period funcionContinuidad sentenciaElse
    | Array Tkn_period funcionContinuidad sentenciaElse
    |Id identSentencia sentenciaElse
    | ;
stepF: Step variableStep | ;
sub:Sub Id sentenciaElse EndSub ;
if : If Tkn_left_paren variable Tkn_right_paren Then sentenciaIf EndIf;
while : While Tkn_left_paren variable Tkn_right_paren sentenciaElse EndWhile;
for :For Id identFor Tkn_equals variable To variable stepF sentenciaElse EndFor;
identSentencia: Tkn_left_paren Tkn_right_paren
    | Tkn_colon
    | Tkn_equals variable
    | Tkn_left_brac variable Tkn_right_brac arrayAsignaciones;
identFor: Tkn_left_brac variable Tkn_right_brac identFor
    | ;
arrayAsignaciones: Tkn_left_brac variable Tkn_right_brac arrayAsignaciones
    | Tkn_equals variable;
valor: Tkn_left_paren variable Tkn_right_paren
    | True
    | False
    | Id arrayOperacion
    | Tkn_number
    | Tkn_text
    |  Program Tkn_period funcionContinuidad
    | Stack Tkn_period funcionContinuidad
    | TextWindow Tkn_period funcionContinuidad
    | Array Tkn_period funcionContinuidad  ;
variable: valor operaciones
    | Tkn_minus valor operaciones ;
arrayOperacion: Tkn_left_brac variable Tkn_right_brac arrayOperacion
    |  ;
operaciones: Tkn_plus variable
    |  Tkn_minus variable
    | Tkn_times variable
    | Tkn_div variable
    | And variable
    | Or variable
    | Tkn_equals variableLog
    | Tkn_leq variableLog
    | Tkn_geq variableLog
    | Tkn_diff variableLog
    | Tkn_less variableLog
    | Tkn_greater variableLog
    |  ;
operacionesLog:  Tkn_plus variable
    |  Tkn_minus variable
    | Tkn_times variable
    | Tkn_div variable
    | And variable
    | Or variable
    |  ;
operacionesStep:  Tkn_plus variableStep
    |  Tkn_minus variableStep
    | Tkn_times variableStep
    | Tkn_div variableStep
    |  ;
variableLog: valor operacionesLog
    | Tkn_minus operacionesLog ;
variableStep: valor operacionesStep
    | Tkn_minus operacionesStep ;
sentenciaIf:  sentenciaElse sentenciaElseIf
    | ;
sentenciaElseIf:   ElseIf Tkn_left_paren variable Tkn_right_paren Then sentenciaIf
    |  Else sentenciaElse
    | ;
funcionContinuidad: Id  Tkn_left_paren funcionVar Tkn_right_paren ;
funcionVar: Tkn_comma funcionVar
    | variable funcionVar
    | ;

//lexico
Tkn_equals : '=';
Tkn_period : '.';
Tkn_comma : ',';
Tkn_colon : ':';
Tkn_left_brac : '[';
Tkn_right_brac : ']';
Tkn_left_paren : '(';
Tkn_right_paren : ')';
Tkn_plus : '+';
Tkn_minus : '-';
Tkn_times : '*';
Tkn_div : '/';
Tkn_leq : '<=';
Tkn_geq : '>=';
Tkn_diff : '<>';
Tkn_less : '<';
Tkn_greater : '>';

//Reservadas
If: 'If';
Else: 'Else';
Then: 'Then';
EndIf: 'EndIf';
ElseIf: 'ElseIf';
Goto: 'Goto';
While: 'While';
EndWhile: 'EndWhile';
For: 'For';
EndFor: 'EndFor';
To: 'To';
Step: 'Step';
Sub: 'Sub';
EndSub: 'EndSub';
Array: 'Array';
Stack: 'Stack';
Program: 'Program';
True: '"TRUE"';
False: '"FALSE"';
TextWindow :'TextWindow';
Or: 'Or';
And: 'And';

//Operaciones
Tkn_number : [0-9]+[.][0-9]* | [0-9]+;
Tkn_text : ('"') ~["]* ('"') ;
ESPACIO: [ \t\r\n]+ -> skip;
Id :[A-Za-zÇüéäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜøØƒáíóúñÑªºÁÂÀãÃðÐÊËÈıÍÎÏÌÓßÔÒõÕµþÞÚÛÙýÝ][A-Za-z0-9_ÇüéäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜøØƒáíóúñÑªºÁÂÀãÃðÐÊËÈıÍÎÏÌÓßÔÒõÕµþÞÚÛÙýÝ]*;
