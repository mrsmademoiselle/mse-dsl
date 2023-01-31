grammar Rezept;

recipe: 'Rezept' WORD 'Zutaten:' ingredient+ 'Zubereitungsschritte:' preparation_step+;
ingredient: NUMBER UNIT WORD;
preparation_step: NUMBER '.' WORD;

UNIT: 'mg' | 'g' | 'kg' | 'ml' | 'l' | 'dl' ;
WORD: [a-zA-Z]+;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
