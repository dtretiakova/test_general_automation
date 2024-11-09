package codeWarsTasks;

import java.util.HashMap;
import java.util.Map;

/*Given a map of food keys and topping values, modify and return the map as follows:
if the key "potato" has a value, set that as the value for the key "fries".
If the key "salad" has a value, set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */

public class MapTaskCodingBat2 {
    public Map<String, String> toppingsSetting(Map<String, String> map) {
        String keyPotato = "potato";
        String potatoLogic = "fries";
        String keySalad = "salad";
        String saladLogic = "spinach";
        if (map.containsKey(keyPotato)) {
            map.put(potatoLogic, map.get(keyPotato));
        }

        if (map.containsKey(keySalad)) {
            map.put(saladLogic, map.get(keySalad));
        }

        return map;
    }

    public static void main(String[] args) {
        MapTaskCodingBat2 mapTaskCodingBat2 = new MapTaskCodingBat2();
        Map<String, String> map = new HashMap<String, String>();

    }
}
