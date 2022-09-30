package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void checkPasswordLengthTestTrue() {
        // GIVEN
        String password = "QWERTZ1234";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    public void checkPasswordLengthTestFalse() {
        // GIVEN
        String password = "QWERTZ";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    public void checkPasswordLengthTestMaxCharsFalse() {
        // GIVEN
        String password = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, " +
                "sed diam nonumy eirmod tempor invidunt ut labore";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertFalse(actual);
    }
}