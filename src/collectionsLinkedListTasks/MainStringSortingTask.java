package collectionsLinkedListTasks;

//3.Напиши программу, которая создает ArrayList из строк, добавляет в
// него несколько строк, сортирует его в алфавитном порядке и находит индекс заданной строки.

import java.util.ArrayList;
import java.util.Collections;

public class MainStringSortingTask {
    public static void main(String[] args) {
        ArrayList<String> cityOfPoland = new ArrayList<>();
        cityOfPoland.add("Krakov");
        cityOfPoland.add("Warsaw");
        cityOfPoland.add("Lublin");
        cityOfPoland.add("Gdansk");
        cityOfPoland.add("Katowice");
        Collections.sort(cityOfPoland);

        System.out.println(cityOfPoland.get(4));


    }
}
