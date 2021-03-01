package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class IdealoMainPage {

    private static final By BODY = By.cssSelector("body");
    private static final By OK_BTN = By.cssSelector(".btn-accept-all");

    @FindBy(css = "#i-search-input")
    private SelenideElement searchBar;

    @FindBy(css = "body > div > iframe")
    private SelenideElement iframe;


    public void acceptCookies() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        WebElement frame = driver.switchTo().frame(iframe).findElement(BODY);
        frame.findElement(OK_BTN).click();
        driver.switchTo().parentFrame();
    }


    public IdealoEBaikesPage searchByKeyword(String searchKeyword) {
        searchBar.setValue(searchKeyword);
        searchBar.pressEnter();
        return page(IdealoEBaikesPage.class);
    }
}
