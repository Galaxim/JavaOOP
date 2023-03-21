package exercises.bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

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
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        double x = Math.random() * 100;
        String check = x > 50? "Greater than 50":"Smaller than 50";
        System.out.println(check);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person carlo = new Person("Carlo",32,"via della vittoria");
       System.out.println(carlo);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger biggy = new BigInteger("100000000000456680");
        BigDecimal smally = new BigDecimal("4546.45678877653300000000445");
        BigInteger newBiggy = biggy.divide(BigInteger.valueOf(3));
        BigDecimal newSmally = smally.divide(BigDecimal.valueOf(Math.PI));
        System.out.println(newBiggy);
        System.out.println(newSmally);

    }
}
