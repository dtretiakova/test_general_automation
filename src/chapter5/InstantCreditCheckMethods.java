package chapter5;

import java.util.Scanner;
/*
 * Variable scope
 * Напишите программу «мгновенной проверки кредитоспособности», которая одобрит кредит
 * любой, кто зарабатывает более 25 000 долларов США и имеет кредитный рейтинг
 * 700 или выше. Отвергните всех остальных.
 */

public class InstantCreditCheckMethods {
    // Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        // Notify the user
        qualifyUser(qualified);

    }

    public static double getSalary() {
        System.out.println("Please, enter your monthly salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Please, enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void qualifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! We approve your loan request");
        } else {
            System.out.println("Sorry, You have been declined.");
        }
    }
}
