package org.example;
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;
    private String interests;
    public Person (String firstName,String lastName,int age,String partner,String interests)  {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
        this.partner = null;
        this.interests=interests;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
//isRetired (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)
    public boolean isRetired(){
        return (this.age >= 60 && this instanceof Woman) || (this.age >= 65 && this instanceof Man);
    }

    //registerPartnership (мається на увазі, що дружина приймає прізвище чоловіка)

      public void registerPartnership(Person partner) {
        this.partner = partner;
        if (this instanceof Woman) {
            this.lastName = partner.getLastName();
        }
    }
}
