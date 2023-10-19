package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class HannoverStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public HannoverStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}