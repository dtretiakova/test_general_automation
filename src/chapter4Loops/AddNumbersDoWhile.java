package chapter4Loops;

import java.util.Scanner;

public class AddNumbersDoWhile {
    public static void main(String[] args) {
        /*
         * DO WHILE LOOP:
         * Write a program that allows a user to enter two numbers,
         * and then sums up the two numbers. The user should be able to
         * repeat this action until they indicate they are done.
         */

        Scanner scanner = new Scanner(System.in);

        boolean again;
        double sum;

        do {
            System.out.println("Enter your first number");
            int num1 = scanner.nextInt();

            System.out.println("Please enter your second number");
            int num2 = scanner.nextInt();

            sum = num1 + num2;

            System.out.println("This is your sum " + sum);




        }
        while (sum <= 100);

        scanner.close();
    }
}
