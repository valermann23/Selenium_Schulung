package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class FrankfurtStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public FrankfurtStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}