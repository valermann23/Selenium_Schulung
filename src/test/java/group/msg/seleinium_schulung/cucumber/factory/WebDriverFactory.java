package group.msg.seleinium_schulung.cucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {
    private static final ThreadLocal<WebDriver> DRIVERTHREADLOCAL = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        if (DRIVERTHREADLOCAL.get() == null) {
            FirefoxOptions options = new FirefoxOptions();
            DRIVERTHREADLOCAL.set(new FirefoxDriver(options));
        }

        return DRIVERTHREADLOCAL.get();
    }

    public static void quitWebDriver() {
        WebDriver driver = DRIVERTHREADLOCAL.get();
        if (driver != null) {
            driver.quit();
            DRIVERTHREADLOCAL.remove();
        }
    }
}
