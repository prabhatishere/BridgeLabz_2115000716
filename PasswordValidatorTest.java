package com.lcwd.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongP@ss1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Short1"));
    }

    @Test
    void testNoUppercasePassword() {
        assertFalse(validator.isValid("weakpassword1"));
    }

    @Test
    void testNoDigitPassword() {
        assertFalse(validator.isValid("NoDigitsHere"));
    }
}
