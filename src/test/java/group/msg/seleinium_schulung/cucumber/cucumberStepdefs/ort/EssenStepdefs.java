package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;

public class EssenStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public EssenStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

}