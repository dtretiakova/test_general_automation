package codeWarsTasks;

import java.util.HashMap;
import java.util.Map;

/*
Given a map of food keys and their topping values, modify and return the map as follows:
if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class MapTaskCodingBat {
    public Map<String, String> mapSetToppings(Map<String, String> map) {
        String mainLogicKeyIceCream = "ice cream";
        String mainLogicKeySpinach = "spinach";
        String newLogicKey = "yogurt";
        String newValueForSpinach = "nuts";



            if (map.containsKey(mainLogicKeyIceCream)) {
                map.put(newLogicKey, map.get(mainLogicKeyIceCream));
            }
            if (map.containsKey(mainLogicKeySpinach)) {
                map.put(mainLogicKeySpinach, newValueForSpinach);
            }




        return map;
    }


    public static void main(String[] args) {
        MapTaskCodingBat test = new MapTaskCodingBat();
        Map<String, String> map = new HashMap<String, String>();
       map.put("spinach","dirt");
       map.put("ice cream", "cherry");


        System.out.println(test.mapSetToppings(map));

    }
}





