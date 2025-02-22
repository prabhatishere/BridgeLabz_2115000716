package com.lcwd.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "johndoe@example.com", "StrongPass1"));
    }

    @Test
    void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "user@example.com", "password1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "invalid-email", "password1"));
    }

    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "user@example.com", "short"));
    }
}
