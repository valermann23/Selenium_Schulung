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

    /**
     * This method initializes the Eventim start page using the provided WebDriver.
     *
     * @param driver the WebDriver instance to use
     */
    public EventimStartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the Eventim site is displayed.
     *
     * @throws AssertionError if the Eventim site is not displayed.
     */
    public void checkIfDisplayedEventimSite() {
        Assert.assertTrue(logoEventim.isDisplayed(), "Eventim Site is not displayed");
    }

    /**
     * Checks if the "Menü Alle Events" button is displayed.
     *
     * @throws AssertionError if the "Menü Alle Events" button is not displayed.
     */
    public void checkIfDisplayedMenueAlleEvents() {
        Assert.assertTrue(btnAlleEvents.isDisplayed(), "Menü Alle Events  is not displayed");
    }

    /**
     * Clicks the "Alle Orte" button.
     */
    public void clickBtnAlleOrte() {
        btnAlleOrte.click();
    }

    /**
     * Clicks the "Akzeptieren" button on the cookie dialog.
     */
    public void clickBtnAkzeptierenCookieDialog() {
        btnAkzeptierenCookieDialog.click();
    }

    /**
     * Clicks the title "Elbphilharmonie Hamburg" in the events section.
     */
    public void clickTitleElbphilharmonieHamburg() {
        eventsElbphilharmonieHamburg.click();
    }
}
