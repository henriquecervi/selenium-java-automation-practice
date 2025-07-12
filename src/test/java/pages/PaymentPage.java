package pages;

import factory.PaymentDataFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPage {

    private final WebDriver driver;
    private final By menuContas = By.cssSelector("[data-toggle='dropdown']");
    private final By linkAdicionar = By.cssSelector(".dropdown-menu a[href='/addConta']");
    private final By insertName = By.id("nome");
    private final By saveButton = By.cssSelector("button.btn.btn-primary[type='submit']");
    private final By tableId = By.id("tabelaContas");
    private final By removePayment = By.cssSelector(".glyphicon.glyphicon-remove-circle");
    private String lastGeneratedName;



    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPaymentMenu() {
        driver.findElement(menuContas).click();
    }

    public void clickAddPayment() {
        driver.findElement(linkAdicionar).click();
    }

    public void addName() {
        lastGeneratedName = PaymentDataFactory.generatePaymentName();
        driver.findElement(insertName).sendKeys(lastGeneratedName);
    }

    public void saveButton() {
        driver.findElement(saveButton).click();
    }

    public boolean verifyPaymentAdded() {
        String tableContent = driver.findElement(tableId).getText();
        return tableContent.contains(lastGeneratedName);
    }

    public void removePayment() {
        List<WebElement> rows = driver.findElements(By.cssSelector("#tabelaContas tbody tr"));
        rows.stream()
                .filter(row -> row.getText().contains(lastGeneratedName))
                .findFirst()
                .ifPresent(row -> row.findElement(removePayment).click());
    }
}
