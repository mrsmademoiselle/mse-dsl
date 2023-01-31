
import antlr_stuff.RezeptLexer;
import antlr_stuff.RezeptParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class main {
    public static void main(String[] args) {

        // EA 1.1
        Training training = new Training()
                .programName("Grundtraining")
                .withDog(new Training.Dog()
                        .name("Teddy")
                        .breed("Berner Sennenhund")
                        .age(1)
                        .color("dreifarbig"))
                .withCommand(new Training.Command()
                        .name("Sitz")
                        .withStep("Leckerli in die Hand nehmen")
                        .withStep("Handzeichen für 'Sitz' geben")
                        .withStep("'Sitz' sagen")
                        .withStep("Warten, bis der Hund sitzt")
                        .withStep("Hund loben")
                        .withStep("Leckerli geben"))
                .withCommand(new Training.Command()
                        .name("Platz")
                        .withStep("Leckerli in die Hand nehmen")
                        .withStep("Handzeichen für 'Platz' geben")
                        .withStep("Warten, bis der Hund liegt")
                        .withStep("Hund loben")
                        .withStep("Leckerli geben")
                );

        System.out.println("Training Programm erfolgreich erstellt!");

        // EA 1.2
        try {
            // Text eingeben und als Input-Stream and den Lexer geben
            var input = "Rezept\nBananeneis\nZutaten:\n100g Bananen\n100g Sahne\n100g Zucker\nZubereitungsschritte:\n1. Zutaten zusammenmischen\n2. Mischung fuer mind 6 Stunden in das Gefrierfach geben\n";
            InputStream is = new ByteArrayInputStream( input.getBytes() );
            CharStream charStream = CharStreams.fromStream(is);
            RezeptLexer lexer = new RezeptLexer(charStream);

            // Tokens vom Lexer ziehen und an den Parser geben
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RezeptParser parser = new RezeptParser(tokens);

            // Parsen und printen
            ParseTree tree = parser.recipe();
            System.out.println("----------------- ERGEBNIS: ");
            System.out.println(tree.toStringTree(parser));

            printVocabulary(lexer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Für Debugging
     */
    private static void printVocabulary(Lexer lexer){
        System.out.println("#################");
        Vocabulary vocabulary = lexer.getVocabulary();
        lexer.reset();
        for (Token token: lexer.getAllTokens()) {
            System.out.println(token.getLine() + ":" + token.getCharPositionInLine() + " '" + token.getText() + "' " + vocabulary.getSymbolicName(token.getType()));
        }
    }
}
