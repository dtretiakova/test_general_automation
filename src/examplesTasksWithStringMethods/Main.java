package examplesTasksWithStringMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("To change your password enter your old password:");
        try {
            String oldPassword = scanner.next();

            System.out.println("Please enter your name:");
            String name = scanner.next();

            System.out.println("Enter tour password:" + "\n" +
                    "The password must be at least eight characters long" + "\n" +
                    "Contain an uppercase letter" + "\n" +
                    "Contain a special character" + "\n" +
                    "Not contain the username" + "\n" +
                    "Not be the same as the old password.");
            String newPassword = scanner.next();
            passwordValidator.isPasswordValid(newPassword, name, oldPassword);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
