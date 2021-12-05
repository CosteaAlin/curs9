package ro.fasttrackit.curs9.homework.exercise1;

public class Electronics extends Product {
    protected String type;
    protected double length;
    protected double width;
    protected double height;
    protected double weight;

    public Electronics(String name, double price, String description, int quantity, String type,
                       double length, double width, double height, double weight) {
        super(name, price, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return String.format("Name: %s, price: %.2f, description: %s, quantity: %d, type: %s, " +
                        "length: %.2f, width: %.2f, height: %.2f, weight: %.2f",
                this.name, this.price, this.description, this.quantity, this.type, this.length,
                this.weight, this.height, this.weight);
    }
}
