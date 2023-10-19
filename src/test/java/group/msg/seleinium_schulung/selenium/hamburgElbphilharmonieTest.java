package group.msg.seleinium_schulung.selenium;

import group.msg.seleinium_schulung.cucumber.pageobjects.DuckduckgoPage;
import group.msg.seleinium_schulung.cucumber.pageobjects.EventimStartPage;
import group.msg.seleinium_schulung.cucumber.pageobjects.orte.HamburgPage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class hamburgElbphilharmonieTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private DuckduckgoPage duckduckgoPage;
    private EventimStartPage eventimStartPage;
    private HamburgPage hamburgPage;
    private Actions actions;

    @BeforeMethod
    public void setUp() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);

        duckduckgoPage = new DuckduckgoPage(driver);
        eventimStartPage = new EventimStartPage(driver);
        hamburgPage = new HamburgPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    /**
     * Dieser Test prüft, ob die Suchmaschine 'duckduckgo.de' zur Website von 'eventim' führt
     * und wie ein Benutzer die Eventim-Webseite nutzt, um nach Veranstaltungen in der Elbphilharmonie Hamburg zu suchen
     */
    @Test
    public void hamburgElbphilharmoniePageTest() {
        //Precondition
        driver.get("https://www.duckduckgo.de/");
        //Prozess
        duckduckgoPage.clickInputSearchboxWebSiteDuckduckgo();
        duckduckgoPage.sendKeysInputSearchboxAndClickEnter("eventim");
        duckduckgoPage.clickLinkEventimFromDuckduckgo();
        eventimStartPage.clickBtnAkzeptierenCookieDialog();
        wait.until(ExpectedConditions.visibilityOf(eventimStartPage.btnAlleEvents));
        eventimStartPage.checkIfDisplayedMenueAlleEvents();
        eventimStartPage.clickBtnAlleOrte();
        actions.moveToElement(eventimStartPage.ortHamburg).perform();
        wait.until(ExpectedConditions.visibilityOf(eventimStartPage.eventsElbphilharmonieHamburg));
        eventimStartPage.clickTitleElbphilharmonieHamburg();
        //Ergebnisse
        hamburgPage.checkIfDisplayedAdresseElbphilharmonieHamburg();
        hamburgPage.checkIfDisplayedBtnKalender();
        hamburgPage.checkIfDisplayedBtnFilter();
    }
}
