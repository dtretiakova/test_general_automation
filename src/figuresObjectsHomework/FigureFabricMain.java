package figuresObjectsHomework;

import java.util.Scanner;

public class FigureFabricMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FabricFigures fabricFigures = new FabricFigures();
        do {
            Figure figure = new Figure();
            figure.printInfo();

            int numberOfFigure = scanner.nextInt();
            if (numberOfFigure == 1) {
                System.out.println("You picked Circle!");
                System.out.println("Please enter radius of the Circle");
                double radius = 0;
                try {
                    radius = scanner.nextDouble();
                    if (radius <= 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println(" You entered invalid radius, radius should be positive number");
                    continue;
                }
                Circle circle = new Circle(radius);
                boolean addedCircle = fabricFigures.addFigureToKit(circle);
                circle.setName(numberOfFigure);
                circle.calculatePerimeter();
                circle.calculateArea();
                circle.setColor();
                System.out.println(circle.toString());
                if (!addedCircle) {
                    System.out.println("You created 3 figures. Your kit is full. Have a good day!");
                    break;
                }
            } else if (numberOfFigure == 2) {
                System.out.println("You picked Triangle!");
                System.out.println("Please enter 2 sides of the Rectangle");
                double firstSide;
                double secondSide;
                try {
                    firstSide = scanner.nextDouble();
                    secondSide = scanner.nextDouble();
                    if (firstSide <= 0 || secondSide <= 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println(" You entered invalid radius, radius should be positive number");
                    continue;
                }
                Rectangle rectangle = new Rectangle(firstSide, secondSide);
                boolean addedRectangle = fabricFigures.addFigureToKit(rectangle);
                rectangle.setName(numberOfFigure);
                rectangle.calculatePerimeter();
                rectangle.calculateArea();
                rectangle.setColor();
                System.out.println(rectangle.toString());
                if (!addedRectangle) {
                    System.out.println("You created 3 figures. Your kit is full. Have a good day!");
                    break;
                }
            } else if (numberOfFigure == 3) {
                System.out.println("You picked Rectangle!");
                System.out.println("Please enter 3 sides of the Rectangle");
                double firstSide;
                double secondSide;
                double thirdSide;
                try {
                    firstSide = scanner.nextDouble();
                    secondSide = scanner.nextDouble();
                    thirdSide = scanner.nextDouble();
                    if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception e) {
                    System.out.println(" You entered invalid radius, radius should be positive number");
                    continue;
                }
                Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
                boolean addedTriangle = fabricFigures.addFigureToKit(triangle);
                triangle.setName(numberOfFigure);
                triangle.calculatePerimeter();
                triangle.calculateArea();
                triangle.setColor();
                System.out.println(triangle.toString());
                if (!addedTriangle) {
                    System.out.println("You created 3 figures. Your kit is full. Have a good day!");
                    break;
                }
            } else if (numberOfFigure == 0) {
                System.out.println("Have a good day!");
                break;
            }
        }
        while (true);
    }

}



