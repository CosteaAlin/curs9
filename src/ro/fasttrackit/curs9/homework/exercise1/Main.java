package ro.fasttrackit.curs9.homework.exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("lipstick", 29.99, "lite",
                5, "red", 9.5);
        System.out.println(cosmetics);

        Electronics electronics=new Electronics("microwave", 109.90, "economic",
                2, "pro",55,25,20,37);
        System.out.println(electronics);

        Fridge fridge=new Fridge("fridge", 509.90, "resistant",
                1, "business",70,50,120,137, -30);
        System.out.println(fridge);
    }
}
