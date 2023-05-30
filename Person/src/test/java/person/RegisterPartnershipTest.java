package person;

import org.example.Man;
import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPartnershipTest {
    @DataProvider(name = "partnerData")
    public Object[][] getPartnerData() {
        // Define test data
        Man man = new Man("Alex", "Trust", 50, null, "Sport");
        Woman woman = new Woman("Kate", "Middleton", 55, null, "Music");

        return new Object[][]{
                {man},
                {woman}
        };
    }

    @Test(dataProvider = "partnerData")
    public void testRegisterPartnership(Person partner) {
        Person registration = new Person("Alex", "Trust", 50, null, "Sport");
        registration.registerPartnership(partner);
        if (partner instanceof Woman) {
            Assert.assertEquals(registration.getLastName(), partner.getLastName());
        } else {
            Assert.assertNull(registration.getLastName());
        }
    }
}
