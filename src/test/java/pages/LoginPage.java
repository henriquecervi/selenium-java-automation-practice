package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static WebDriver driver;

    private final By inputUsername = By.cssSelector("[name='email']");
    private final By inputPassword = By.id("senha");
    private final By loginButton = By.cssSelector("[type='submit']");
    private static final By welcomeMessage = By.cssSelector("[role='alert']");

    public static String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }

    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
    }

    public void fillUsername(String usuario) {
        driver.findElement(inputUsername).sendKeys(usuario);
    }

    public void fillPassword(String senha) {
        driver.findElement(inputPassword).sendKeys(senha);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}