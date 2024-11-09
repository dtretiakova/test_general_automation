package chapter3IfElseStatements;

import java.util.Scanner;

public class HomeworkDollarGame {
    public static void main(String[] args) {
        // the objective of the game is to enter enough change to equal exactly one dollar.

        double pennie = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! " + "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarter");
        int numOfQuarters = scanner.nextInt();
        scanner.close();

        double total = numOfPennies * pennie + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if (total < dollar) {
            double difference = dollar - total;
            System.out.println("Oh noo! You got lower total sum. The difference: " + difference);

        } else if (dollar < total) {
            double difference = total - dollar;
            System.out.println("Oh noo! Game over. You got higher total sum. The difference: " + difference);
        } else {
            System.out.println("Congrats! You won, nice try");
        }


    }
}
