package group.msg.seleinium_schulung.cucumberStepdefs;

import group.msg.seleinium_schulung.factory.WebDriverFactory;
import group.msg.seleinium_schulung.pageobjects.MsgGroupPage;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Und;

public class StartCloseStepdefs extends AbstractPageStepdefs {

    @Und("Der Test ist beendet")
    public void derTestIstBeendet() {
        WebDriverFactory.quitWebDriver();
    }
}
