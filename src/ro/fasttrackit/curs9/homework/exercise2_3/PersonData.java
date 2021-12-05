package ro.fasttrackit.curs9.homework.exercise2_3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PersonData {
    Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public long getAge() {
        long years = ChronoUnit.YEARS.between(person.getBirthday(), LocalDateTime.now());
        return years;
    }
}
