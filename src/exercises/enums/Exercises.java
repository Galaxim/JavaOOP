package exercises.enums;

import java.time.MonthDay;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }


    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        // Your code here
        for (Enum day :Days.values()){
            System.out.println(day);
        }
    }
    public enum Days{
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        private boolean isWeekend;
        Days(boolean isWeekend){
            this.isWeekend=isWeekend;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        System.out.println(getDateRange(Seasons.SPRING));
    }
    public enum Seasons {
        SPRING, SUMMER, FALL, WINTER
    }

    public static String getDateRange(Seasons season) {
        switch(season) {
            case SPRING:
                return "March - May";
            case SUMMER:
                return "June - August";
            case FALL:
                return "September - November";
            case WINTER:
                return "December - February";
            default:
                return "Invalid season";
        }
    }
    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        System.out.println(trafficLight(TrafficLight.RED));
    }
    public enum TrafficLight{RED,YELLOW,GREEN}
    public static String trafficLight(TrafficLight colorA){
        if(colorA==TrafficLight.RED){
            return "The next state of traffic light will be yellow";
        } else if (colorA==TrafficLight.YELLOW) {
            return "The next state of traffic light will be green";
        } else
            return "The next state of traffic light will be red";
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        if (Days.FRIDAY.isWeekend){
            System.out.println("Weekend");
        } else System.out.println("Weekday");


    }


    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        System.out.println(operation(Operator.MULTIPLY,num1,num2));
    }
    public enum Operator {ADD,SUBTRACT,MULTIPLY,DIVIDE}
    public static double operation(Operator operation,Double firstNum,Double secondNum){
        switch (operation){
            case ADD:
                return firstNum+secondNum;
            case SUBTRACT:
                return firstNum-secondNum;
            case DIVIDE:
                return firstNum/secondNum;
            case MULTIPLY:
                return firstNum*secondNum;
            default:
                return 0.0;
        }
    }
}
