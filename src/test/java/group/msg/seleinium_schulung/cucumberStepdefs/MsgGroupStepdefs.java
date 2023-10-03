package group.msg.seleinium_schulung.cucumberStepdefs;

import group.msg.seleinium_schulung.factory.WebDriverFactory;
import group.msg.seleinium_schulung.pageobjects.MsgGroupPage;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Und;

public class MsgGroupStepdefs extends AbstractPageStepdefs {
    private final MsgGroupPage MSGGROUPPAGE;

    public MsgGroupStepdefs() {
        MSGGROUPPAGE = new MsgGroupPage(driver);
    }

    @Und("Die Web-Seite 'MSG Group' wird angezeigt.")
    public void dieWebSeiteWirdAngezeigt() {
        MSGGROUPPAGE.checkIfDisplayedMsgGroupSite();
    }

    @Und("Auf die Taste 'Über MSG Group' gedrückt wird")
    public void aufDieTasteUberMSGGroupGedrucktWird() {
        MSGGROUPPAGE.clickLinkUeberMsg();
    }

    @Dann("Eine Seite 'Über MSG Group' wird angezeigt")
    public void eineSeiteUberMSGGroupWirdAngezeigt() {
        MSGGROUPPAGE.checkIfDisplayedTitleDieMsgGruppe();
    }


}
