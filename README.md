## EA 1.1
Java DSL: in Training.java gebaut, in main.java beispielhaft verwendet

## EA 2.2
Es wurde ANTLR gewählt.
Alles ANTLR-spezifische wurde im Ordner antlr_stuff abgelegt.  

Ggf. muss die ANTLR Dependency manuell hinzugefügt werden (wenn sie oder das Plugin von ANTLR in der IDE vorher noch nicht verwendet wurde), daher habe ich sie in dem Ordner abgelegt.
In IntelliJ geht das über File -> Project Structure -> Libraries -> + -> Java -> .jar auswählen.

Die Grammatik befindet sich in Rezept.g4, alle weiteren Dateien wurden durch das ANTLR Plugin automatisch generiert.

 Durch Ausführen der main-Methode in main.java wird der Parser beispielhaft ausgeführt.