package ro.fasttrackit.curs9.inheritence;

public class Bike {

    protected int tyrePressure;
    protected int speed;

    public Bike() {
        this(30);
    }

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
        this.speed = 0;
    }

    public void increaseSpeed(int increment) {
        speed += increment;
    }

    protected void stop() {
        speed = 0;
    }

    void resetTyrePressure() {
        tyrePressure = 30;
    }

    private void downhillSpeed() {
        speed = 60;
    }

    public String toString() {
        return "tyrePressure: " + tyrePressure + " speed: " + speed;
    }

    void flatTyre() {
        System.out.println("Bike implementation");
        tyrePressure = 0;
    }
}
