package group.msg.seleinium_schulung.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EventimStartPage {

    @FindBy(xpath = "//a[@class='cmpboxbtn cmpboxbtnyes cmptxt_btn_yes']")
    private WebElement btnAkzeptierenCookieDialog;

    @FindBy(xpath = "//img[contains(@title, 'intrittskarten')]")
    public WebElement logoEventim;

    @FindBy(xpath = "//li[contains(@data-qa, 'cat')]")
    public WebElement btnAlleEvents;

    @FindBy(xpath = "//li[contains(@data-qa, 'city')]")
    public WebElement btnAlleOrte;

    @FindBy(xpath = "//*[text()='Hamburg']")
    public WebElement ortHamburg;

    @FindBy(xpath = "//*[text()='Elbphilharmonie Hamburg']")
    public WebElement eventsElbphilharmonieHamburg;


    public EventimStartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the "msgGroupSite" element is displayed on Msg Group Site.
     * <p>
     * This method uses the Assert.assertTrue() method to check if the "msgGroupSite" element is displayed.
     * If the element is displayed, the method will continue execution without any assertion error.
     * If the element is not displayed, an assertion error will be thrown.
     */
    public void checkIfDisplayedEventimSite() {
        Assert.assertTrue(logoEventim.isDisplayed(), "Eventim Site is not displayed");
    }

    public void checkIfDisplayedMenueAlleEvents() {
        Assert.assertTrue(btnAlleEvents.isDisplayed(), "Menü Alle Events  is not displayed");
    }

    public void clickMenueAlleOrte() {
        btnAlleOrte.click();
    }

    public void clickBtnAkzeptierenCookieDialog() {
        btnAkzeptierenCookieDialog.click();
    }

    public void clickTitleElbphilharmonieHamburg() {
        eventsElbphilharmonieHamburg.click();
    }

    public void clickHamburg() {
        ortHamburg.click();
    }
}
