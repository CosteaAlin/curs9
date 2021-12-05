package ro.fasttrackit.curs9.homework.exercise1;

public class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(String name, double price, String description, int quantity, String color, double weight) {
        super(name, price, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        return String.format("Name: %s, price: %.2f, description: %s, quantity: %d, color: %s, weight: %.2f",
                this.name, this.price, this.description, this.quantity, this.color, this.weight);
    }
}
