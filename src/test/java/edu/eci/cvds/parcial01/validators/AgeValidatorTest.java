package edu.eci.cvds.parcial01.validators;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeValidatorTest {
    @Test
    public void NotUnderageTest() {
        try {
            assertFalse(AgeValidator.Validate(18));
            assertFalse(AgeValidator.Validate(149));
        } catch (AgeValidatorException e) {
            fail("Failed with valid values");
        }
    }

    @Test
    public void UnderageTest() {
        try {
            assertTrue(AgeValidator.Validate(17));
            assertTrue(AgeValidator.Validate(0));
        } catch (AgeValidatorException e) {
            fail("Failed with valid values");
        }
    }

    @Test
    public void InvalidAgeTest() {
        try {
            assertTrue(AgeValidator.Validate(155));
            assertFalse(AgeValidator.Validate(-1));
            fail("Did not fail with valid values");
        } catch (AgeValidatorException e) {
            assertEquals(AgeValidatorException.INVALID_AGE, e.getMessage());
        }
    }
}