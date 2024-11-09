package exceptionsTemperatureConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            temperatureConverter.printInfo();
           try {
               number = scanner.nextInt();
           } catch (InputMismatchException e){
               System.out.println("Invalid input. Please enter a numeric value.");
           }
            if (number == 1) {
                System.out.println("Please enter temperature in Celsius degrees:");
                try {
                    temperatureConverter.calculateCelsiusToFahrenheit(scanner.nextDouble());
                } catch (InvalidTemperatureException e) {
                    System.out.println("Exception: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }

                System.out.println(temperatureConverter);
            } else if (number == 2) {
                System.out.println("Please enter temperature in Fahrenheit degrees:");
                try {
                    temperatureConverter.calculateFahrenheitToCelsius(scanner.nextDouble());
                } catch (InvalidTemperatureException e) {
                    System.out.println("Exception: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
                System.out.println(temperatureConverter);
            } 
        } while (number != 0);

        System.out.println("Have a good day!");

    }


}
