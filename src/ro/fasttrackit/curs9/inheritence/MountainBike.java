package ro.fasttrackit.curs9.inheritence;

public class MountainBike extends Bike {
    private int suspensionstrength;

    public MountainBike(){
        super();
        this.suspensionstrength=5;
    }
    
    public MountainBike(int tyrePressure,int suspension){
        super(tyrePressure);
        this.suspensionstrength=suspension;
    }

    public int getSuspensionstrength() {
        return suspensionstrength;
    }

    public void setSuspensionstrength(int strength) {
        if (strength >= 0 && strength < 10) {
            this.suspensionstrength = strength;
        }
    }

    @Override
    public void increaseSpeed(int speed) {
        this.speed += speed - 3;
        this.tyrePressure -= 1;
    }

    @Override
    void flatTyre(){
        super.flatTyre();
        System.out.println("MountainBike implementantion");
        stop();
    }
}
