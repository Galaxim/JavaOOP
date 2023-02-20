package exercises.encapsulation;

public class exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student Kristian = new Student();
        Kristian.setAge(102);
        System.out.println(Kristian.getAge());
        Kristian.setHeight(2.23);
        System.out.println(Kristian.getHeight());
        Kristian.setName("Calogero");
        System.out.println(Kristian.getName());
        Kristian.setWeight(22);
        System.out.println(Kristian.getWeight());
        Kristian.setLastName("Calogeri");
        System.out.println(Kristian.getLastName());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student Getz = new Student();
        Getz.setAge(-21);
        System.out.println(Getz.getAge());
        Getz.setHeight(1.02);
        System.out.println(Getz.getHeight());
        Getz.setWeight(87);
        System.out.println(Getz.getWeight());
    }

}

