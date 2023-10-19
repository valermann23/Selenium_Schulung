package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;
import io.cucumber.java.de.Und;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventimStartSeiteStepdefs extends AbstractPageStepdefs {
    private final EventimStartPage PAGE;

    public EventimStartSeiteStepdefs() {
        PAGE = new EventimStartPage(DRIVER);
    }

    @Und("Die Web-Seite 'Eventim' wird angezeigt")
    public void dieWebSeiteWirdAngezeigt() {
        PAGE.checkIfDisplayedEventimSite();
    }

    @Und("Auf der Web-Seite 'Eventim' wird eine Taste {string}( angezeigt)( gedrückt)")
    public void dieWebSeiteWirdAlleEventsAngezeigt(String taste) {
        switch (taste) {
            case "Alle Events":
                WAIT.until(ExpectedConditions.visibilityOf(PAGE.btnAlleEvents));
                PAGE.checkIfDisplayedMenueAlleEvents();
                break;
            case "Alle Orte":
                PAGE.clickBtnAlleOrte();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + taste);
        }
    }

    @Und("Auf der Standortliste wird eine {string}-Taste gedrückt")
    public void dieWebSeiteWirdOrtGedrueckt(String ort) {
        Actions actions = new Actions(DRIVER);

        switch (ort) {
            case "Hamburg":
                actions.moveToElement(PAGE.ortHamburg).perform();
                break;
            case "Berlin":
                //todo locator
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ort);
        }
    }

    @Und("Auf der Veranstaltungsliste für Hamburg wird eine {string}-Taste gedrückt")
    public void dieWebSeiteWirdElbphilharmonieHamburgGedrueckt(String veranstaltung) {
        switch (veranstaltung) {
            case "Elbphilharmonie Hamburg":
                WAIT.until(ExpectedConditions.visibilityOf(PAGE.eventsElbphilharmonieHamburg));
                PAGE.clickTitleElbphilharmonieHamburg();
                break;
            case "Barclays Arena":
                //todo locator
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + veranstaltung);
        }
    }

    @Und("Im Cookie-Dialog wird eine Taste 'Akzeptieren' gedrückt")
    public void imCookieDialogWirdEineTasteGedruckt() {
        PAGE.clickBtnAkzeptierenCookieDialog();
    }
}
