public class main {
    public static void main(String[] args) {
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

    }
}
