package figuresObjectsHomework;

public class Circle extends Figure {
    private double radius;
    double Pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }



@Override
public double calculatePerimeter() {
    double circlePerimeter = 2 * Pi * radius;
    setPerimeter(circlePerimeter);
    return circlePerimeter;
}


@Override
public double calculateArea() {
    double root = 2;
    double circleArea = Pi * (Math.pow(getPerimeter(), root));
    setArea(circleArea);
    return circleArea;
}
}
