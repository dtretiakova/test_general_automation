package homeworkLoop;

import java.util.Scanner;

//Напишите программу на Java, которая проверяет,
//является ли введенная пользователем строка палиндромом, используя циклы и операторы условия.

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Please enter the word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String reversedWord = "";

        int i = word.length() - 1;


        while (i >= 0) {
            char letter = word.charAt(i);
            reversedWord = reversedWord.concat(String.valueOf(letter));
            i--;
        }


        if (reversedWord.equalsIgnoreCase(word)) {
            System.out.println("Word " + reversedWord + " is palindrome");
        } else {
            System.out.println("Your word isn't palindrome");
        }


    }
}

