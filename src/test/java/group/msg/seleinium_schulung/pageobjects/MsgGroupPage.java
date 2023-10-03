package group.msg.seleinium_schulung.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MsgGroupPage {

    @FindBy(xpath = "//body[contains(@class, 'msggp')]")
    private WebElement msgGroupSite;

    @FindBy(xpath = "//a[text()='Über msg']")
    private WebElement linkUeberMsg;
    @FindBy(xpath = "//*[text()='Die msg-\u200BGruppe']")
    private WebElement webElementDieMsgGruppe;

    public MsgGroupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the "msgGroupSite" element is displayed on Msg Group Site.
     * <p>
     * This method uses the Assert.assertTrue() method to check if the "msgGroupSite" element is displayed.
     * If the element is displayed, the method will continue execution without any assertion error.
     * If the element is not displayed, an assertion error will be thrown.
     */
    public void checkIfDisplayedMsgGroupSite() {
        Assert.assertTrue(msgGroupSite.isDisplayed(), "Msg Group Site is not displayed");
    }

    /**
     * Clicks on the link "Ueber Msg".
     * This method performs a click action on the "Ueber Msg" link.
     */
    public void clickLinkUeberMsg() {
        linkUeberMsg.click();
    }

    /**
     * Checks if the title "Die Msg Gruppe" is displayed.
     * This method verifies if the element with the id "webElementDieMsgGruppe" is displayed on the page.
     * If the element is not displayed, an assertion failure will occur with the error message "Element Die Msg Gruppe is not displayed".
     */
    public void checkIfDisplayedTitleDieMsgGruppe() {
        Assert.assertTrue(webElementDieMsgGruppe.isDisplayed(), "Element Die Msg Gruppe is not displayed");
    }

}
