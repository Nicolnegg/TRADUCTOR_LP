grammar MiLenguaje;
//sitactico

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
Tkn_number : '[0-9]+[.]{0,1}[0-9]*|[0-9]+';
Tkn_text : '"[^"]*"';
Tkn_espacio : '\n';
Id : '[A-Za-zÇüéäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜøØƒáíóúñÑªºÁÂÀãÃðÐÊËÈıÍÎÏÌÓßÔÒõÕµþÞÚÛÙýÝ][A-Za-z0-9_ÇüéäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜøØƒáíóúñÑªºÁÂÀãÃðÐÊËÈıÍÎÏÌÓßÔÒõÕµþÞÚÛÙýÝ]*';