package ro.fasttrackit.curs9.homework.exercise2_3;

import java.time.LocalDateTime;

public class Employee implements Person {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime birthday;
    protected String address;
    protected LocalDateTime dateOfEmployment;
    protected String position;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address,
                    LocalDateTime dateOfEmployment, String position){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthday=birthday;
        this.address=address;
        this.dateOfEmployment=dateOfEmployment;
        this.position=position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }
}
