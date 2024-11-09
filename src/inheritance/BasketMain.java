package inheritance;

public class BasketMain {
    public static void main(String[] args) {

        Basket basket = new Basket();

        Product product = new Product("Milk", 15.20);
        Product product2 = new ColoredProduct("Ice cream", 7.99, "Orange");
        Product product3 = new WeightProduct("Potato", 4.28, 1.50);
        Product product4 = new MultiProduct("Rice", 19.99, "White", 1.00);

        ColoredProduct productNew = new MultiProduct("Rice", 19.99, "White", 1.00);

        Object obj = new MultiProduct("Rice", 19.99, "White", 1.00);
        MultiProduct cwp = (MultiProduct) obj;


        basket.add(product);
        basket.add(product2);
        basket.add(product3);
        basket.add(product4);

        basket.printInfo();

        obj.toString();


    }
}
