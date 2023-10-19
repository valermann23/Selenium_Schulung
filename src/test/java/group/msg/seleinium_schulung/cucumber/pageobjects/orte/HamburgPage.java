package group.msg.seleinium_schulung.cucumber.pageobjects.orte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HamburgPage {

    @FindBy(xpath = "//div[@class='stage-content-text']//div[contains(text(),'Platz der Deutschen Einheit, 20457 Hamburg')]")
    public WebElement adresseElbphilharmonieHamburg;

    @FindBy(xpath = "//a[contains(@data-qa, 'calendar')]")
    public WebElement btnCalender;

    @FindBy(xpath = "//button[contains(@data-qa, 'filter')]")
    public WebElement btnFilter;

    /**
     * Initializes the HamburgPage object.
     *
     * @param driver the WebDriver to be used for initializing the page.
     */
    public HamburgPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Checks if the button "Kalender" is displayed on the HamburgPage.
     * If the button "Kalender" is not displayed on the page,
     * an AssertionError is thrown with the message "Eine Taste Kalender is not displayed".
     *
     * @throws AssertionError if the button "Kalender" is not displayed.
     */
    public void checkIfDisplayedBtnKalender() {
        Assert.assertTrue(btnCalender.isDisplayed(), "Eine Taste Kalender is not displayed");
    }

    /**
     * Checks if the button "Filter" is displayed on the current page.
     * If the button "Filter" is not displayed on the page,
     * an AssertionError is thrown with the message "Eine Taste Filter is not displayed".
     *
     * @throws AssertionError if the button "Filter" is not displayed.
     */
    public void checkIfDisplayedBtnFilter() {
        Assert.assertTrue(btnFilter.isDisplayed(), "Eine Taste Filter is not displayed");
    }

    /**
     * Checks if the address "Elbphilharmonie Hamburg" is displayed on the current page.
     * If the address "Elbphilharmonie Hamburg" is not displayed on the page,
     * an AssertionError is thrown with the message "Adresse Elbphilharmonie Hamburg is not displayed".
     *
     * @throws AssertionError if the address "Elbphilharmonie Hamburg" is not displayed.
     */
    public void checkIfDisplayedAdresseElbphilharmonieHamburg() {
        Assert.assertTrue(adresseElbphilharmonieHamburg.isDisplayed(), "Adresse Elbphilharmonie Hamburg is not displayed");
    }
}
