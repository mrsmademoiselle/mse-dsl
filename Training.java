import java.util.ArrayList;
import java.util.List;

public class Training {
    private String programName;
    private List<Dog> dogs = new ArrayList<>();
    private List<Command> commands = new ArrayList<>();

    public Training programName(String programName) {
        this.programName = programName;
        return this;
    }

    public Training withDog(Dog dog) {
        this.dogs.add(dog);
        return this;
    }

    public Training withCommand(Command command) {
        this.commands.add(command);
        return this;
    }

    public static class Dog {
        private String name;
        private String breed;
        private int age;
        private String color;

        public Dog name(String name) {
            this.name = name;
            return this;
        }
        
        public Dog color(String color) {
            this.color = color;
            return this;
        }

        public Dog breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog age(int age) {
            this.age = age;
            return this;
        }
    }

    public static class Command {
        private String name;
        private List<String> steps = new ArrayList<>();

        public Command name(String name) {
            this.name = name;
            return this;
        }

        public Command withStep(String step) {
            this.steps.add(step);
            return this;
        }
    }
}

