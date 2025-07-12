package tests;

import base.SetUp;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends SetUp {

    @Test
    public void testSuccessfulLogin() {
        assertEquals("Bem vindo, Henrique!", LoginPage.getWelcomeMessage());
    }
}