package person;
import org.junit.Assert;
import org.junit.Test;
import org.example.Man;
import org.example.Woman;

public class PersonTests {

    @Test
    public void testIsRetired_AgeBelowRetireAge_False() {

        Man man = new Man("Alex", "Trust", 50, null, "Sport");
        Woman woman = new Woman("Kate", "Middleton", 55, null, "Music");


        boolean manIsRetired = man.isRetired();
        boolean womanIsRetired = woman.isRetired();


        Assert.assertEquals( "Age of man is above of retirement age", false, manIsRetired);
        Assert.assertEquals( "Age of woman is below of retirement age", false, womanIsRetired);
    }

    @Test
    public void testIsRetired_AgeAboveRetireAge_True() {

        Man man = new Man("Alex", "Trust", 70, null, "Sports");
        Woman woman = new Woman("Kate", "Middleton", 59, null, "Music");

        boolean manIsRetired = man.isRetired();
        boolean womanIsRetired = woman.isRetired();


        Assert.assertEquals( "Age of man is below of retirement age", true, manIsRetired);
        Assert.assertEquals( "Age of woman is below of retirement age",true, womanIsRetired);
    }


    @Test
    public void testRegisterPartnership() {

        Man man = new Man("Alex", "Trust", 70, null, "Sports");
        Woman woman = new Woman("Kate", "Middleton", 59, null, "Music");

        man.registerPartnership(woman);

        Assert.assertEquals(woman, man.getPartner());
        Assert.assertEquals(man.getLastName(), woman.getLastName());
    }

    @Test
    public void testRegisterPartnership_ShouldSetPartnerAndLastName_ForWomanAndMan() {
        Man man = new Man("Alex", "Trust", 70, null, "Sports");
        Woman woman = new Woman("Kate", "Middleton", 59, null, "Music");

        woman.registerPartnership(man);

        Assert.assertEquals(man, woman.getPartner());
        Assert.assertEquals(man.getLastName(), woman.getLastName());
    }
}

