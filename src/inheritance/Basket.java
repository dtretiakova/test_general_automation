package inheritance;

public class Basket {
    private Product[] product = new Product[10];

    public void add(Product product) {
        boolean added = false;
        for (int i = 0; i < this.product.length; i++) {
            if (this.product[i] == null) {
                this.product[i] = product;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Error: Basket is full! Not enough space in the basket.");
        }
    }

    public void remove(String productName) {
        for (int i = 0; i < this.product.length; i++) {
            if (product[i] != null && product[i].getName().equals(productName)) {
                product[i] = null;
                break;
            }
        }
    }

    public void printInfo() {
        boolean empty = true;
        double total = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i] != null) {
                System.out.println(product[i].getInfo());
                total += product[i].getPrice();
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Basket is empty.");
        } else {
            System.out.println("Total: $" + total);
        }
    }
}
