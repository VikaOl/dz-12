package org.example;
public class Man extends Person{

    public Man(String firstName, String lastName, int age, String partner, String interests) {
        super(firstName, lastName, age, partner, interests);
    }
    public void registerPartnership(Woman woman) {
        setPartner(woman);
        woman.setPartner(this);
        woman.setLastName(getLastName());
    }
}
