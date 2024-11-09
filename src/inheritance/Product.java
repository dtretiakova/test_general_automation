package inheritance;

//корзина на 10 товаров, возможность добавлять товари в корзину, посмотреть что в корзине, предусмотреть, что корзина
//может заполнится, что после добавление 11-го товара корзина не сломается
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
       return " Product name: " + name + "; Price: " + price + ";";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
