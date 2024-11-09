package abstraction;

public class Rectangle extends Figure{

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}
