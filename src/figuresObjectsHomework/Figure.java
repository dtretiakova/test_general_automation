package figuresObjectsHomework;

public class Figure {
    private String name;
    private String color;
    private double perimeter;
    private double area;
    private ColorOfFiguresGenerator colorOfFiguresGenerator = new ColorOfFiguresGenerator();


   public void printInfo() {
        System.out.println("You should enter number for start: " + "\n"
                + "1 - Circle" + "\n"
                + "2 - Triangle" + "\n"
                + "3 - Rectangle" + "\n"
                + "0 - Exit");
    }


    public void setName(int numberOfFigure) {
        switch (numberOfFigure) {
            case 1:
                this.name = "Circle";
                break;
            case 2:
                this.name = "Triangle";
                break;
            case 3:
                this.name = "Rectangle";
                break;

        }
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePerimeter() {
        return perimeter;
    }

    public double calculateArea() {
        return area;
    }


    public void setColor() {
        color = colorOfFiguresGenerator.randomizeFigureColor();
    }


    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}

