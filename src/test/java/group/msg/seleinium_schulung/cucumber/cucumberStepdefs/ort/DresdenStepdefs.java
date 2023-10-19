package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class DresdenStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public DresdenStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}