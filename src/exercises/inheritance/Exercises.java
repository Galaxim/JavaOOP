package exercises.inheritance;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog entei=new Dog(210,198,"No, because it's legendary");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
       Bird corviknigkt= new Bird(220,75,400);
       Fish magikarp= new Fish(90,10,"Pokemon");
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog entei=new Dog(210,198,"No, because it's legendary");
        Bird corviknigkt= new Bird(220,75,400);
        Fish magikarp= new Fish(90,10,"Pokemon");
        System.out.println(entei.runSpeedMetersPerSecond(entei));
        System.out.println(magikarp.swimSpeedMetersPerSecond(magikarp));
        System.out.println(corviknigkt.flySpeedMetersPerSecond(corviknigkt));
        if (entei.runSpeedMetersPerSecond(entei)> magikarp.swimSpeedMetersPerSecond(magikarp) && entei.runSpeedMetersPerSecond(entei)> corviknigkt.flySpeedMetersPerSecond(corviknigkt)){
            System.out.println("The animal with the fastest movement speed is entei");
        } else if (corviknigkt.flySpeedMetersPerSecond(corviknigkt)> entei.runSpeedMetersPerSecond(entei) && corviknigkt.flySpeedMetersPerSecond(corviknigkt)> magikarp.swimSpeedMetersPerSecond(magikarp)){
            System.out.println("The animal with the fastest movement speed is corviknight");
        } else System.out.println("The animal with the fastest movement speed is magikarp");

    }
}
