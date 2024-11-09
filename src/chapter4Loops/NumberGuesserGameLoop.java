package chapter4Loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGameLoop {
    public static void main(String[] args) {

        int attempt = 5;
        int number = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);

        //System.out.println(randomNumber);

        System.out.println("Guess the number from 1 to 100 using 5 trying");

        for (int i = 1; i <= attempt; i++) {
            System.out.println(i + " attempt. Please enter the number:");
            number = scanner.nextInt();

            if (number > randomNumber) {
                System.out.println("You almost guessed it. The hidden number is smaller");

            } else if (number < randomNumber) {
                System.out.println("You almost guessed it. The hidden number is greater");

            } else {
                System.out.println("You are win! Congrats!");
                break;
            }
        }
        if (number != randomNumber) {
            System.out.println("Ohhh no, you lost. The hidden number is " + randomNumber);
        }
    }
}



        /*win ? System.out.println("+") : System.out.println("-");

        if (win) {
            System.out.println("+");
        } else {
            System.out.println("-");
            }
         */


