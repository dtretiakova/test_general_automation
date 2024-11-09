package chapter4Loops;

import java.util.Scanner;

public class Example2Loop {
    /* Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

    public static void main(String[] args) {
        //Get word
        System.out.println("Please enter the word: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        //Get the number of repetitions first 3 letters
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        String textSub = text.substring(0,3);
        String total = "";


        for (int i = 0; i < number; i++) {
                total = total + textSub;
                System.out.println(total);


        }


    }
}
