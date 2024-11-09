package inheritance;

public class Customer {
    private Basket basket;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void addProduct(Product product) {
        if (basket != null) {
            basket.add(product);
        }
    }

    public void removeProduct(String productName) {
        if (basket != null) {
            basket.remove(productName);
        }
    }

    public void showInfo() {
        System.out.print("Name: " + name);
        if (basket != null) {
            basket.printInfo();
        } else {
            System.out.println("Basket not exist!");
        }
        System.out.println("------------------");
    }

    public Basket getBasket() {
        Basket tmpBasket = basket;
        basket = null;
        return tmpBasket;
    }
}
