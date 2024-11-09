package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Book implements Product{

    private double Price;
    private String name;
    private String color;
    private String author;
    private int pages;
    private String isbn;

    @Override
    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        test();
        return isbn;
    }
}
