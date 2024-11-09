package figuresObjectsHomework;

public class Rectangle extends Figure {
private double firstSide;
private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;

    }

    @Override
    public double calculatePerimeter() {
        double rectanglePerimeter = (firstSide + secondSide) * 2;
       setPerimeter(rectanglePerimeter);
        return rectanglePerimeter;
    }

    @Override
    public double calculateArea() {
        double rectangleArea = firstSide * secondSide;
        setArea(rectangleArea);
        return rectangleArea;
    }
}
