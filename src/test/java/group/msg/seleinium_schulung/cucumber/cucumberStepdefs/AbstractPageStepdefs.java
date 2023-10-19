package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPageStepdefs {

    protected final WebDriver DRIVER;
    protected final WebDriverWait WAIT;

    public AbstractPageStepdefs() {
        DRIVER = WebDriverFactory.getWebDriver();
        DRIVER.manage().window().maximize();
        DRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WAIT = new WebDriverWait(DRIVER, Duration.ofSeconds(5));
    }
}
