package homeworkLoop;

//Напишите программу на Java, которая находит факториал введенного пользователем числа, используя циклы.

import java.util.Scanner;

public class FactorialOfTheEnteredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        scanner.close();

        int total = factorialNumber(number);
        System.out.println(total);

        calculationOfTheAmount(number);
    }

    public static int factorialNumber(int number) {
        int total = 1;

        for (int i = 1; i <= Math.abs(number); i++) {
            total = total*i;
        }


        return total;
    }


    //Напишите программу на Java, которая находит сумму цифр введенного пользователем числа,
    // используя циклы и операции с числами.

    public static void calculationOfTheAmount (int number)  {
        int sum = 0;
        int rest;

        while (number > 0) {
            rest = number % 10;
            number = number / 10;
            sum = sum + rest;
        }
        System.out.println(sum);
    }



}

