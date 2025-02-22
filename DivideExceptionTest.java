package com.lcwd.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideExceptionTest {
    DivideException divider = new DivideException();

    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> divider.divide(10, 0));
    }

    @Test
    void testValidDivision() {
        assertEquals(5, divider.divide(10, 2));
    }
}
