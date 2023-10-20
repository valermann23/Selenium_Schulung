package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.pageobjects.DuckduckgoPage;
import io.cucumber.java.de.Angenommen;
import io.cucumber.java.de.Und;
import io.cucumber.java.de.Wenn;

public class DuckduckgoDeStepdefs extends AbstractPageStepdefs {
    private final DuckduckgoPage DUCKDUCKGOPAGE;

    public DuckduckgoDeStepdefs() {
        DUCKDUCKGOPAGE = new DuckduckgoPage(DRIVER);
    }

    @Angenommen("Eine Suchmaschine 'duckduckgo.de' wird aufgerufen")
    public void eineSuchmaschineWirdAufgerufen() {
        DRIVER.get("https://www.duckduckgo.de/");
        DUCKDUCKGOPAGE.clickInputSearchboxWebSiteDuckduckgo();
    }

    @Wenn("{string} in das Suchfeld eingegeben wird")
    public void inDasSuchfeldEingegebenWird(String input) {
        DUCKDUCKGOPAGE.sendKeysInputSearchboxAndClickEnter(input);
    }

    @Und("In der Ergebnisliste auf Link 'Karriere Hamburger Hochbahn AG' gedrückt wird")
    public void inDerErgebnislisteAufLinkWwwMsgGroupGedrucktWird() {
        DUCKDUCKGOPAGE.linkToKarriereHamburgerHochbahnAGFromDuckduckgo();
    }
}
