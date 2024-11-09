package chapter5;

import java.util.Scanner;

public class GreetingsMethods {
    /*
     * OUR FIRST METHOD
     * Write a method that asks a user for their name, then greets them by name.
     */

    public static void main(String[] args) {
        System.out.println("Hello, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //call method greetUser
        greetUser(name);
        int number23 = 7;
        int number11= 5;

        int sum = calculateSum(1, number11, number23);

        System.out.println(sum);
    }

    public static void greetUser (String name) {
        System.out.println("Hi there, " + name);

    }

    public static int calculateSum (int number, int number2, int number3) {
        int sum = number / number2 + number % (number * number3);
        return sum;
    }
}
