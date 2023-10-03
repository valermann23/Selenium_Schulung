package group.msg.seleinium_schulung;

import group.msg.seleinium_schulung.pageobjects.DuckduckgoPage;
import group.msg.seleinium_schulung.pageobjects.MsgGroupPage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class UeberMsgPageTest {
    private WebDriver driver;
    private DuckduckgoPage duckduckgoPage;
    private MsgGroupPage msgGroupPage;

    @BeforeMethod
    public void setUp() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        duckduckgoPage = new DuckduckgoPage(driver);
        msgGroupPage = new MsgGroupPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        driver.get("https://www.duckduckgo.de/");
        duckduckgoPage.clickInputSearchboxWebSiteDuckduckgo();
        duckduckgoPage.sendKeysInputSearchboxAndClickEnter("msg");
        duckduckgoPage.clickLinkMsgGroupFromDuckduckgo();
        msgGroupPage.checkIfDisplayedMsgGroupSite();
        msgGroupPage.clickLinkUeberMsg();
        msgGroupPage.checkIfDisplayedTitleDieMsgGruppe();
    }
}
