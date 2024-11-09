package chapter3IfElseStatements;

import java.util.Scanner;

/*
Initialize known values

Get values for the unknown

Quick detour for the bonus earners

Output
 */
public class SalaryCalculatorIf {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("The employee's pay is $" + salary);

    }
}
