package collectionsLinkedListTasks;

//4.Напиши программу, которая создает ArrayList, добавляет в него несколько имен и проверяет,
// содержится ли заданное имя в списке.

import java.util.ArrayList;
import java.util.Scanner;

public class FinderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Katia");
        names.add("Dasha");

        System.out.println("Please enter the name you want to find");
        String input = scanner.next();
        if (names.contains(input)){
            System.out.println("List contains name " + input);
        } else {
            System.out.println("List does not contain name " + input);
        }

    }
}
