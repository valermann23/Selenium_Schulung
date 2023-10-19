package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class BerlinStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public BerlinStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}