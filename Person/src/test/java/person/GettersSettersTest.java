package person;
import org.example.Person;
import org.junit.Assert;
import org.junit.Test;

public class GettersSettersTest{

    @Test
    public void testGettersAndSetters() {

        String firstName = "Alex";
        String lastName = "Trust";
        int age = 30;
        String interests = "Sports";

        Person person = new Person(null, null, 0, null, null);

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setInterests(interests);

        Assert.assertEquals("First name should match", firstName, person.getFirstName());
        Assert.assertEquals("Last name should match", lastName, person.getLastName());
        Assert.assertEquals("Age should match", age, person.getAge());
        Assert.assertEquals("Interests should match", interests, person.getInterests());
    }
}
