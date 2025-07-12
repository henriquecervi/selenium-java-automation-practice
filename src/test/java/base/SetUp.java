package base;
import factory.CredentialsFactory;
import factory.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.LoginUtils;

public class SetUp {

        protected WebDriver driver;

        @BeforeEach
        public void setUp() {
            driver = DriverFactory.createDriver("chrome");
            driver.manage().window().maximize();

            LoginUtils.performLogin(driver, CredentialsFactory.getUsername(),
                    CredentialsFactory.getPassword());
        }

        @AfterEach
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

}
