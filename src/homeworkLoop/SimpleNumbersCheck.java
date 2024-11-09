package homeworkLoop;

import java.util.Scanner;

//Напишите программу на Java, которая проверяет,
// является ли введенное пользователем число простым, используя циклы и операторы условия.
public class SimpleNumbersCheck {
    public static void main(String[] args) {

        System.out.println("Please enter your number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int rest = 0;
        int index = 2;
        boolean isSimple = true;

        //Натуральное число, большее 1 , называется простым, если оно ни на что не делится, кроме себя и 1 .
        // Другими словами, n > 1 – простое, если при его делении на любое число кроме 1 и n есть остаток.
        // Например, 5 это простое число, оно не может быть разделено без остатка на 2 , 3 и 4 .
        if (number <= 0) {
            System.out.println("Negative numbers cannot be prime.");
        }

        if (number == 1 || number == 2 || number == 3) {
            System.out.println("Your number is simple");
            return;
        }

        while (index < number) {
            rest = number % index;
            if (rest == 0) {
                isSimple = false;
                break;
            }
            index++;
        }
        if (isSimple) {
            System.out.println("Your number is simple");
        } else {
            System.out.println("Your number is not simple");
        }

    }
}
