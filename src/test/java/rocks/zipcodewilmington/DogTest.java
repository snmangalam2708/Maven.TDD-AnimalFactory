package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void setUp(){

       Dog dog = new Dog(null, null, 1);
    }


    // TODO - Create tests for `speak`

    @Test
    public void speakTest()
    {
        Dog testDog = new Dog("Milo", null, null);
        String expected = "bark!";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDate() {

        Dog testDog = new Dog("Grundy", new Date(), null);
        Date expected = new Date();
        Date actual = testDog.getBirthDate();
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `void eat(Food food)`


    @Test
    public void eatTest(){

        Dog testDog = new Dog("Nona", new Date(), 2);
        Food food = new Food();
        testDog.eat(food);
        Assert.assertEquals(new Integer(1), testDog.getNumberOfMealsEaten());

    }



    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest ()
    {
        Dog testDog = new Dog("Misty", null, 43580);
        Integer expected = 43580;
        Integer actual = testDog.getId();
        Assert.assertEquals(expected,actual);
    }



    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritance()
    {
        Dog testDog = new Dog ("Filo", null, null);
        Assert.assertEquals(true, testDog instanceof Mammal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkAnimalInheritance() {
        Dog testDog = new Dog("Fifo", null, null);
        Assert.assertEquals(true, testDog instanceof Animal);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Junior";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
