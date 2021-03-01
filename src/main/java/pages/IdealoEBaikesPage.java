package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class IdealoEBaikesPage {

    @FindBy(xpath = "//select")
    private SelenideElement sortBox;

    @FindBy(xpath = "//option[@value='maxPrice']")
    private SelenideElement highestPriceOption;

    public void selectDropdownOption(String option) {
        sortBox.selectOption(option);
    }

    public SelenideElement getSelectedOption() {
        return highestPriceOption;
    }

}
