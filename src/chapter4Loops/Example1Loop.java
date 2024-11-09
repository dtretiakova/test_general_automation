package chapter4Loops;

import java.util.Scanner;

public class Example1Loop {
    /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/
    public static void main(String[] args) {
        //Get the text
        System.out.println("Please enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        //Get the number of repetitions
        System.out.println("Please enter the number of repetitions of the entered text: ");
        int numberOfRepetitions = scanner.nextInt();

       String total = "";

        for (int i = 0; i < numberOfRepetitions; i++) {
            total = total + text;
        }
        System.out.println(total);

    }
}





