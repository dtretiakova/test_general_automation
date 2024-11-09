package codeWarsTasks;

import java.util.HashMap;
import java.util.Map;
/*
Given a map of food keys and topping values, modify and return the map as follows:
if the key "ice cream" is present, set its value to "cherry".
In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

 */
public class MapTask {

    public Map<String, String> getTopping(Map<String, String> topping) {
        String iceCreamTopping = "cherry";
        String iceCream = "ice cream";
        String bread = "bread";
        String breadTopping = "butter";

        topping.put(bread, breadTopping);

            if (topping.containsKey("ice cream")) {
                topping.put(iceCream, iceCreamTopping);
            }


        return topping;
    }


    public static void main(String[] args) {
        MapTask mapTask = new MapTask();
        Map<String, String> foodKit = new HashMap<>();


        System.out.println(mapTask.getTopping(foodKit));

    }
}
