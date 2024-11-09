package inheritance;

public class ColoredProduct extends Product {
    private String color;

    public ColoredProduct(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Color: " + color;
    }

}
