package ro.fasttrackit.curs9.homework.exercise1;

public class Product {
    protected double price;
    protected String name;
    protected String description;
    protected int quantity;

    public Product(String name, double price, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
}
