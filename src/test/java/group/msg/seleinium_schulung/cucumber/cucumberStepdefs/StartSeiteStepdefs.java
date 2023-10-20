package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.pageobjects.HochbahnStartPage;
import io.cucumber.java.de.Und;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartSeiteStepdefs extends AbstractPageStepdefs {
    private final HochbahnStartPage PAGE;

    public StartSeiteStepdefs() {
        PAGE = new HochbahnStartPage(DRIVER);
    }

    @Und("Die Web-Seite 'Karriere bei der HOCHBAHN' wird angezeigt")
    public void dieWebSeiteWirdAngezeigt() {
        PAGE.checkIfDisplayedKarriereHochbahn();
    }

    @Und("Auf der Web-Seite wird eine Taste {string}( angezeigt)( gedrückt)")
    public void dieWebSeiteWirdAngezeigt(String taste) {
        switch (taste) {
            case "Unternehmen":
                WAIT.until(ExpectedConditions.visibilityOf(PAGE.btnUnternehmen));
                PAGE.checkIfDisplayedTasteUnternehmen();
                break;
            case "Verantwortung":
                PAGE.checkIfDisplayedTasteVerantwortung();
                break;
            case "Projekte":
                PAGE.checkIfDisplayedTasteProjekt();
                break;
            case "Karriere":
                PAGE.checkIfDisplayedTasteKarriere();
                break;
            case "Betrieb":
                PAGE.checkIfDisplayedTasteBetrieb();
                break;
            case "Presse":
                PAGE.checkIfDisplayedTastePresse();
                break;
            case "Kontakt":
                PAGE.clickTasteKontakt();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + taste);
        }
    }
}
