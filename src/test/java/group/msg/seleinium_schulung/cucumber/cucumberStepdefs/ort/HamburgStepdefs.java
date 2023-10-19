package group.msg.seleinium_schulung.cucumber.cucumberStepdefs.ort;

import group.msg.seleinium_schulung.cucumber.cucumberStepdefs.AbstractPageStepdefs;
import group.msg.seleinium_schulung.cucumber.pageobjects.orte.HamburgPage;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Und;

public class HamburgStepdefs extends AbstractPageStepdefs {
    private final HamburgPage PAGE;

    public HamburgStepdefs() {
        PAGE = new HamburgPage(DRIVER);
    }

    @Dann("wird eine Adresse für {string} angezeigt")
    public void wirdEineAdresseFurAngezeigt(String adresse) {
        switch (adresse) {
            case "Elbphilharmonie Hamburg":
                PAGE.checkIfDisplayedAdresseElbphilharmonieHamburg();
                break;
            case "Barclays Arena":
                //todo locator
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + adresse);
        }
    }

    @Und("Eine Taste {string} wird angezeigt")
    public void eineTasteWirdAngezeigt(String taste) {
        switch (taste) {
            case "Kalender":
                PAGE.checkIfDisplayedBtnKalender();
                break;
            case "Filter":
                PAGE.checkIfDisplayedBtnFilter();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + taste);
        }
    }
}