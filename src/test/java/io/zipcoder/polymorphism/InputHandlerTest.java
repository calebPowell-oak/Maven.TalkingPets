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
}