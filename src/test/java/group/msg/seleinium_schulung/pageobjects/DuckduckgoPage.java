package group.msg.seleinium_schulung.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckduckgoPage {
    @FindBy(xpath = "//input[contains(@id, 'searchbox')]")
    private WebElement inputSearchboxDuckduckgo;
    @FindBy(xpath = "//span[contains(text(),'msg:')]")
    private WebElement linkToMsgGroupFromDuckduckgo;

    public DuckduckgoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks on the input searchbox on the Duckduckgo website.
     * This method is used to simulate the action of clicking on the input searchbox on the Duckduckgo website.
     * @throws NoSuchElementException if the input searchbox element is not found on the page
     */
    public void clickInputSearchboxWebSiteDuckduckgo() throws NoSuchElementException {
        inputSearchboxDuckduckgo.click();
    }

    /**
     * Enters the provided text into the input searchbox on the Duckduckgo website and triggers the "Enter" key.
     * This method is used to simulate the action of entering text into the input searchbox on the Duckduckgo website and clicking the "Enter" key.
     * @param sendKeys the text to be entered into the input searchbox
     */
    public void sendKeysInputSearchboxAndClickEnter(String sendKeys) {
        inputSearchboxDuckduckgo.sendKeys(sendKeys);
        inputSearchboxDuckduckgo.sendKeys(Keys.ENTER);
    }

    /**
     * Clicks on the link to the messaging group on the Duckduckgo website.
     * This method is used to simulate the action of clicking on the link to the messaging group on the Duckduckgo website.
     */
    public void clickLinkMsgGroupFromDuckduckgo() {
        linkToMsgGroupFromDuckduckgo.click();
    }
}
