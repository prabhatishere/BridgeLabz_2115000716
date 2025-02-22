package com.lcwd.test;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateFormat() throws ParseException {
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> formatter.formatDate("25-12-2023"));
    }
}
