package abstraction;

public class FigureTester {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
