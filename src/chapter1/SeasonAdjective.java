package chapter1;

import java.util.Scanner;

public class SeasonAdjective {
    public static void main(String[] args) {
        //1.Ask for a season of the year

        System.out.println("What is your favourite season of the year?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2.Ask whole number

        System.out.println("Enter whole number");
        int number = scanner.nextInt();

        //3.Ask an adjective

        System.out.println("Enter an adjective which describe to the your favourite season");
        String adjective = scanner.next();
        scanner.close();

        //4.Use answers for complete the sentence below

        System.out.println("'On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.' ");
    }
}
