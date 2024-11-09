package collectionsLinkedListTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1.Напиши программу, которая создает ArrayList, добавляет в него 5 имен и выводит их на экран.


public class MainTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> userNames = new ArrayList<>(5);
        while (userNames.size() < 5) {
            System.out.println("Please enter your name:");
            String name = scanner.next();
            userNames.add(name);
        }
        System.out.println(userNames.toString());
    }

}

