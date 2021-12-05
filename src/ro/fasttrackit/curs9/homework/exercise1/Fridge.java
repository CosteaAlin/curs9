package ro.fasttrackit.curs9.homework.exercise1;

public class Fridge extends Electronics {

    private double temperature;

    public Fridge(String name, double price, String description, int quantity, String type,
                       double length, double width, double height, double weight, double temperature){
        super(name, price, description, quantity, type,length,width,height,weight);
        this.temperature=temperature;
    }

    public String toString() {
        return String.format("Name: %s, price: %.2f, description: %s, quantity: %d, type: %s, " +
                        "length: %.2f, width: %.2f, height: %.2f, weight: %.2f, temperature: %.2f",
                this.name, this.price, this.description, this.quantity, this.type, this.length,
                this.weight, this.height, this.weight, this.temperature);
    }
}
