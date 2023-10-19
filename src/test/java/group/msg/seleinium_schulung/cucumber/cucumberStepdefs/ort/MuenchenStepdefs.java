package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class MuenchenStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public MuenchenStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}