package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputHandlerTest {
    @Test
    public void defaultConstTest(){
        // Given
        Integer expectedPets = 0;
        Integer expectedSizes = 0;

        // When
        InputHandler n = new InputHandler();

        // Assert
        Assert.assertEquals(expectedPets, n.getNumberOfPets());
        Assert.assertTrue(expectedSizes == n.getPetNames().size());
        Assert.assertTrue(expectedSizes == n.getPetTypes().size());
    }

    @Test
    public void setNumberOfPets(){
        // Given
        Integer expected = 3;

        // When
        InputHandler n = new InputHandler();
        n.setNumberOfPets(expected);
        Integer actual = n.getNumberOfPets();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}