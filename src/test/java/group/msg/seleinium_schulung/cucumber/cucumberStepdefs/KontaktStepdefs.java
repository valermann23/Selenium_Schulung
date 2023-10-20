package group.msg.seleinium_schulung.cucumber.cucumberStepdefs;

import group.msg.seleinium_schulung.cucumber.pageobjects.KontaktPage;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Und;

public class KontaktStepdefs extends AbstractPageStepdefs {
    private final KontaktPage PAGE;

    public KontaktStepdefs() {
        PAGE = new KontaktPage(DRIVER);
    }

    @Dann("wird eine Web-Seite {string} angezeigt")
    public void wirdEineAdresseFurAngezeigt(String seite) {
        switch (seite) {
            case "KONTAKT":
                PAGE.checkIfDisplayedSeiteKontakt();
                break;
            case "Unternehmen":
                //todo
                break;
            case "Verantwortung":
                //todo
                break;
            case "Projekte":
                //todo
                break;
            case "Karriere":
                //todo
                break;
            case "Betrieb":
                //todo
                break;
            case "Presse":
                //todo
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + seite);
        }
    }
}