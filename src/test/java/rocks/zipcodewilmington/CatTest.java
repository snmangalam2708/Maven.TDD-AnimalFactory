package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {
        Cat testCat = new Cat("Fluffy", null, null);
        String expectedName = "Fluffy";
        String actualName = testCat.getName();
        Assert.assertEquals(expectedName, actualName);

    }

    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        Cat testCat = new Cat("Misty", null, null);
        String expected = "meow!";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @ Test
    public void setBirthDateTest()
    {
        Cat testCat = new Cat("Dewey", new Date(), null);
        Date expected = new Date();
        Date actual = testCat.getBirthDate();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest()
    {
        Cat testCat = new Cat("Misty", null, null);
        Food chows = new Food();
        testCat.eat(chows);
        Assert.assertEquals(Integer.valueOf(1), testCat.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest ()
    {
        Cat testCat = new Cat("Spooky", null, 7317);
        Integer expected = 7317;
        Integer actual = testCat.getId();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void checkAnimalInheritance() {
        Cat testCat = new Cat("Minty", null, null);
        Assert.assertEquals(true, testCat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritance()
    {
        Cat testCat = new Cat ("Puss", null, null);
        Assert.assertEquals(true, testCat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Catty";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
