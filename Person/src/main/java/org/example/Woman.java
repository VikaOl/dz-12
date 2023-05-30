package org.example;
public class Woman extends Person{
    public Woman(String firstName, String lastName, int age, String partner, String interests) {
        super(firstName, lastName, age, partner, interests);
    }
    public void registerPartnership(Man man) {
        setPartner(man);
        man.setPartner(this);
        man.setLastName(getLastName());
    }

}
