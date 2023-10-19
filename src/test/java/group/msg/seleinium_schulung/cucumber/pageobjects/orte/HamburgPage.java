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


    public HamburgPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void checkIfDisplayedBtnKalender() {
        Assert.assertTrue(btnCalender.isDisplayed(), "Eine Taste Kalender is not displayed");
    }

    public void checkIfDisplayedBtnFilter() {
        Assert.assertTrue(btnFilter.isDisplayed(), "Eine Taste Filter is not displayed");
    }
    public void checkIfDisplayedAdresseElbphilharmonieHamburg() {
        Assert.assertTrue(adresseElbphilharmonieHamburg.isDisplayed(), "Adresse Elbphilharmonie Hamburg is not displayed");
    }
}
