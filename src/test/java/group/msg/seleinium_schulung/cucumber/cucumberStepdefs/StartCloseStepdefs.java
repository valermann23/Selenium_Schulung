package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.factory.WebDriverFactory;
import io.cucumber.java.de.Und;

public class StartCloseStepdefs extends AbstractPageStepdefs {

    @Und("Der Test ist beendet")
    public void derTestIstBeendet() {
        WebDriverFactory.quitWebDriver();
    }
}
