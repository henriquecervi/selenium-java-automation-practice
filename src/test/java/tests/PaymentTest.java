package tests;

import base.SetUp;
import org.junit.jupiter.api.Test;
import pages.PaymentPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentTest extends SetUp {

    @Test
    public void addPaymentTest()  {

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.clickPaymentMenu();
        paymentPage.clickAddPayment();
        paymentPage.addName();
        paymentPage.saveButton();
        assertTrue(paymentPage.verifyPaymentAdded());

        paymentPage.removePayment();
    }
}
