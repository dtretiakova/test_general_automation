package chapter3IfElseStatements;

import java.util.Scanner;

public class GradeMessageSwitchSt {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();


        String message;
        grade = grade.toUpperCase();

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Good job!";
                break;
            case "С":
                message = "Great job.";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. You entered invalid grade.Try again.";
                break;
        }

        System.out.println(message);

    }
}
