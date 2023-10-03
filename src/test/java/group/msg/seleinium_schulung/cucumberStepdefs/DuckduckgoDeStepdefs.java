package group.msg.seleinium_schulung.cucumberStepdefs;

import group.msg.seleinium_schulung.pageobjects.DuckduckgoPage;
import io.cucumber.java.de.Angenommen;
import io.cucumber.java.de.Und;
import io.cucumber.java.de.Wenn;

public class DuckduckgoDeStepdefs extends AbstractPageStepdefs {
    private final DuckduckgoPage DUCKDUCKGOPAGE;

    public DuckduckgoDeStepdefs() {
        DUCKDUCKGOPAGE = new DuckduckgoPage(driver);
    }

    @Angenommen("Eine Suchmaschine 'duckduckgo.de' wird aufgerufen")
    public void eineSuchmaschineWirdAufgerufen() {
        driver.get("https://www.duckduckgo.de/");
        DUCKDUCKGOPAGE.clickInputSearchboxWebSiteDuckduckgo();
    }

    @Wenn("{string} in das Suchfeld eingegeben wird")
    public void inDasSuchfeldEingegebenWird(String input) {
        DUCKDUCKGOPAGE.sendKeysInputSearchboxAndClickEnter(input);
    }

    @Und("In der Ergebnisliste auf Link 'www.msg.group' gedrückt wird")
    public void inDerErgebnislisteAufLinkWwwMsgGroupGedrucktWird() {
        DUCKDUCKGOPAGE.clickLinkMsgGroupFromDuckduckgo();
    }
}
