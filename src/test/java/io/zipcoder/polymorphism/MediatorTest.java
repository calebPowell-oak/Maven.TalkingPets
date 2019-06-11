package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MediatorTest {

    @Test
    public void petClassFromStringTest(){
        // Given
        String expectedStr = "dog";
        Mediator m = new Mediator();

        // When
        Pet actual = m.petFromString(expectedStr,expectedStr);

        // Assert
        Assert.assertTrue(actual instanceof Dog);
        Assert.assertEquals(expectedStr, actual.getName());
    }

    @Test
    public void petClassFromStringTestCat(){
        // Given
        String expectedStr = "cat";
        Mediator m = new Mediator();

        // When
        Pet actual = m.petFromString(expectedStr,expectedStr);

        // Assert
        Assert.assertTrue(actual instanceof Cat);
        Assert.assertEquals(expectedStr, actual.getName());
    }

    @Test
    public void petClassFromStringTestParrot(){
        // Given
        String expectedStr = "parrot";
        Mediator m = new Mediator();

        // When
        Pet actual = m.petFromString(expectedStr,expectedStr);

        // Assert
        Assert.assertTrue(actual instanceof Parrot);
        Assert.assertEquals(expectedStr, actual.getName());
    }

    @Test
    public void petClassFromStringTestNull(){
        // Given
        String expectedStr = "xxx";
        Mediator m = new Mediator();

        // When
        Pet actual = m.petFromString(expectedStr,expectedStr);

        // Assert
        Assert.assertTrue(actual == null);
    }
}
