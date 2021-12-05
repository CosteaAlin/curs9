package ro.fasttrackit.curs9.homework.exercise2_3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Bogdan", "Pop",
                LocalDateTime.of(1989, 06, 2, 0, 0), "line 1",
                LocalDateTime.of(2021, 11, 22, 04, 13), "junior", "py");

        PersonData p1 = new PersonData(programmer);

        System.out.println(p1.getFullName());

        System.out.println(p1.getAge());
    }
}
