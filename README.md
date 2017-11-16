# Descrição
Projeto de Compiladores usando JavaCC para criação de um analisador léxico e sintático para analisar uma linguagem fictica "EST"

Segue abaixo o código proposto usado como base para construção desta gramática:
<br><br>
v1< : array 1..10 of real;<br>
v2 : array 1..20 of integer;<br>
record aluno is<br>
nome : string;<br>
serie : integer;<br>
media : real;<br>
endrecord;<br>

a1 : record aluno;<br>
a2 : record aluno ("zezinho", 1, 10.0);<br>
v3 : array 1..100 of record aluno;<b>

Etapas: 
1) Construção da Gramatica em EBNF;
2) Construção do Analisador Sintatico e Lexico usando JavaCC;


# Ferramenta Complementar
O site abaixo foi utilizado no processo de desenvolvimento da gramatica pois faz uso de diagramas : <br>
http://www.bottlecaps.de/rr/ui
