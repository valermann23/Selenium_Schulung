package group.msg.seleinium_schulung.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HochbahnStartPage {

    @FindBy(xpath = "//div[contains(@id, 'usercentrics')]")
    private WebElement btnAkzeptierenCookieDialog;

    @FindBy(xpath = "//*[text()='Karriere bei der HOCHBAHN']")
    public WebElement logoKarriereHochbahn;

    @FindBy(xpath = "//*[text()='Unternehmen']")
    public WebElement btnUnternehmen;
    @FindBy(xpath = "//*[text()='Verantwortung']")
    public WebElement btnVerantwortung;
    @FindBy(xpath = "//*[text()='Projekte']")
    public WebElement btnProjekte;
    @FindBy(xpath = "//*[text()='Karriere']")
    public WebElement btnKarriere;
    @FindBy(xpath = "//*[text()='Betrieb']")
    public WebElement btnBetrieb;
    @FindBy(xpath = "//*[text()='Presse']")
    public WebElement btnPresse;
    @FindBy(xpath = "//a[contains(@aria-controls, 'navigation-flyout-1260')]")
    public WebElement btnKontakt;


    /**
     * Initializes the Hochbahn Start Page with the provided WebDriver.
     *
     * @param driver the WebDriver instance to use for interacting with the page
     */
    public HochbahnStartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the Karriere Hochbahn page is displayed.
     * If the page is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the page is not displayed
     */
    public void checkIfDisplayedKarriereHochbahn() {
        Assert.assertTrue(logoKarriereHochbahn.isDisplayed(), "Hochbahn Site is not displayed");
    }

    /**
     * Checks if the "Taste Unternehmen" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
    public void checkIfDisplayedTasteUnternehmen() {
        Assert.assertTrue(btnUnternehmen.isDisplayed(), "Eine Taste Unternehmen  is not displayed");
    }

    /**
     * Checks if the "Taste Verantwortung" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
    public void checkIfDisplayedTasteVerantwortung() {
        Assert.assertTrue(btnVerantwortung.isDisplayed(), "Eine Taste Verantwortung  is not displayed");
    }

    /**
     * Checks if the "Projekt" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
    public void checkIfDisplayedTasteProjekt () {
        Assert.assertTrue(btnProjekte.isDisplayed(), "Eine Taste Projekt  is not displayed");
    }

    /**
     * Checks if the "Karriere" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
     public void checkIfDisplayedTasteKarriere() {
        Assert.assertTrue(btnKarriere.isDisplayed(), "Eine Taste Karriere  is not displayed");
    }

    /**
     * Checks if the "Betrieb" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
     public void checkIfDisplayedTasteBetrieb() {
        Assert.assertTrue(btnBetrieb.isDisplayed(), "Eine Taste Betrieb  is not displayed");
    }

    /**
     * Checks if the "Presse" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
     public void checkIfDisplayedTastePresse() {
        Assert.assertTrue(btnPresse.isDisplayed(), "Eine Taste Presse  is not displayed");
    }

    /**
     * Checks if the "Kontakt" button is displayed on the page.
     * If the button is not displayed, an AssertionError is thrown.
     *
     * @throws AssertionError if the button is not displayed
     */
     public void checkIfDisplayedTasteKontakt() {
        Assert.assertTrue(btnKontakt.isDisplayed(), "Eine Taste Kontakt  is not displayed");
    }

    /**
     * Clicks on the "Kontakt" button.
     * This method is used to simulate a user clicking on the "Kontakt" button
     * on the page.
     */
    public void clickTasteKontakt() {
        btnKontakt.click();
    }

    /**
     * Clicks the "Akzeptieren" button on the cookie dialog.
     */
    public void clickBtnAkzeptierenCookieDialog() {
        btnAkzeptierenCookieDialog.click();
    }
}
