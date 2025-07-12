package factory;

import net.datafaker.Faker;

public class PaymentDataFactory {
    private static final Faker faker = new Faker();

    public static String generatePaymentName() {
        return "Payment " + faker.commerce().productName();
    }

}
