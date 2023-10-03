package group.msg.seleinium_schulung.cucumberStepdefs;

import group.msg.seleinium_schulung.factory.WebDriverFactory;
import io.cucumber.java.de.Und;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class AbstractPageStepdefs {

    protected final WebDriver driver;
    public AbstractPageStepdefs() {
        driver = WebDriverFactory.getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
