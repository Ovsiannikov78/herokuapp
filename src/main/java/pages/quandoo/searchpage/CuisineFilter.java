package pages.quandoo.searchpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class CuisineFilter {

    @FindBy(css = ".ulye33-1:nth-child(1) .apti0f-5")
    private SelenideElement cuisineFilter;

    @FindBy(xpath = "//b[contains(.,'African')]")
    private SelenideElement selectedRestaurantCategory;

    @FindBy(css = ".mavxr3-2")
    private SelenideElement resultCount;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private SelenideElement cookies;


    public void selectRestaurantCategory() {
        cuisineFilter.click();
    }

    public SelenideElement restaurantCategory() {
        return selectedRestaurantCategory;
    }

    public SelenideElement restaurantCounter() {
        return resultCount;
    }

    public void acceptCookies() {
        cookies.click();
    }
}
