package figuresObjectsHomework;

public class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle( double firstSide, double secondSide, double thirdSide) {
        try {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0){
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e){
            System.out.println(" You entered invalid radius, radius should be positive number");
        }

    }

    @Override
    public double calculatePerimeter() {
        double trianglePerimeter = firstSide + secondSide + thirdSide;
        setPerimeter(trianglePerimeter);
        return trianglePerimeter;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide)
                * (semiPerimeter - thirdSide));
        setArea(triangleArea);
        return triangleArea;
    }
}
