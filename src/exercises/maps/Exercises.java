package exercises.maps;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        myFirstMap.put(25,"pikachu");
        myFirstMap.put(151,"mew");
        myFirstMap.put(1,"bulbasaur");
        System.out.println(myFirstMap);
        myFirstMap.get(151);
        myFirstMap.remove(1);
        System.out.println(myFirstMap);

        // 1b. Add 3 elements to the map .put
        // 1c. Print the map
        // 1d. Access an element in the map with .get
        // 1e. Remove an element from the map .remove
        // 1f. Print the map again to confirm the element was removed
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;
        Double mostExpensiveMenuItemPrice = 0.0;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        for(Map.Entry<String,Double>entry : menuCostsInEuro.entrySet()){
            if(mostExpensiveMenuItemName == null){
                mostExpensiveMenuItemName = entry.getKey();
                mostExpensiveMenuItemPrice =entry.getValue();
            } else if(mostExpensiveMenuItemPrice< entry.getValue()){
                mostExpensiveMenuItemName = entry.getKey();
                mostExpensiveMenuItemPrice = entry.getValue();
            }
        }

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight
        for (Integer value : fruitWeights.values()){
            totalWeight = totalWeight + value;
        }

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}

