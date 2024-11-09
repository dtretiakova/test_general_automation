package objects;
//возращаемое значение обьект

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom() {
        System.out.println("Please enter the length of room");
        double lengthInput = scanner.nextDouble();
        System.out.println("Please enter the width of room");
        double widthInput = scanner.nextDouble();

        return new Rectangle(lengthInput, widthInput);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
