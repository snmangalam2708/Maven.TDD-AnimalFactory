package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    /*
    TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    */

    @Test
    public void CreateDogTest() {

        String name = "Spike";
        Dog testDog = AnimalFactory.createDog(name, null);

        Assert.assertTrue(testDog instanceof Dog);
    }

    @Test
    public void CreateCatTest() {

        String name = "Max";
        Cat testCat = AnimalFactory.createCat(name, null);

        Assert.assertTrue(testCat instanceof Cat);

    }
}
