package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {
        if (browser == null) {
            throw new IllegalArgumentException("Browser cannot be null.");
        }

        // without lambda
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                return new ChromeDriver();
//            case "firefox":
//                return new FirefoxDriver();
//            default:
//                throw new IllegalArgumentException("Unsupported browser: " + browser);
//        }


        // using lambda
        return switch (browser.toLowerCase()) {
            case "chrome" -> new ChromeDriver();
            case "firefox" -> new FirefoxDriver();
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        };
    }
}