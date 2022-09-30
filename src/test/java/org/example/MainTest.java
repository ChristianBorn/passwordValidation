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
    @Test
    public void checkPasswordOnNumbersfalse() {
        // GIVEN
        String password = "QWERTZUI";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    public void checkPasswordOnNumberstrue() {
        // GIVEN
        String password = "QWERTZUI213123";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    public void checkPasswordOnNumbersToShortfalse() {
        // GIVEN
        String password = "13123";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    public void checkPasswordUpperCaseTrue() {
        // GIVEN
        String password = "qwertZ123";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    public void checkPasswordUpperCaseFalse() {
        // GIVEN
        String password = "qwertz123";
        // WHEN
        boolean actual = Main.passwordInput(password);
        // THEN
        assertFalse(actual);
    }
}