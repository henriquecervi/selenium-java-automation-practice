package utils;

import pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginUtils {

    public static void performLogin(WebDriver driver, String usuario, String senha) {
        driver.get("https://seubarriga.wcaquino.me/");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillUsername(usuario);
        loginPage.fillPassword(senha);
        loginPage.clickLogin();
    }
}