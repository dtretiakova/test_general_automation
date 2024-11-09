package inheritance;

public class MultiProduct extends ColoredProduct {
    private double weight;

    public MultiProduct(String name, double price, String color, double weight) {
        super(name, price, color);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Weight: " + weight;
    }
}
