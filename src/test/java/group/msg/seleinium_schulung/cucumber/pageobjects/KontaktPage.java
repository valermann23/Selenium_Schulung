package group.msg.seleinium_schulung.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KontaktPage {

    @FindBy(xpath = "//span[contains(text(),'Kontakt')]")
    public WebElement seiteKontakt;

    /**
     * Initializes the HamburgPage object.
     *
     * @param driver the WebDriver to be used for initializing the page.
     */
    public KontaktPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    /**
     * Checks if the element "Seite Kontakt" is displayed on the current page.
     * If the element "Seite Kontakt" is not displayed on the page,
     * an AssertionError is thrown with the message "Site Kontakt is not displayed".
     *
     * @throws AssertionError if the element "Seite Kontakt" is not displayed.
     */
    public void checkIfDisplayedSeiteKontakt() {
        Assert.assertTrue(seiteKontakt.isDisplayed(), "Site Kontakt is not displayed");
    }
}
