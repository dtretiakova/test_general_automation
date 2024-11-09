package objects;

// constructors and getters and setters

public class Rectangle {
   private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }
    //can set length and width
    // or we can set like this

    public Rectangle(double length, double width) {
        this.length = length; // can set like this
        setWidth(width); // or can be set this way
        return;
    }


    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

}
