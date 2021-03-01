package idealo;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.IdealoEBaikesPage;
import pages.IdealoMainPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL_IDEALO;

public class IdealoEBaikes {
    IdealoMainPage mainPage;
    IdealoEBaikesPage baikesPage;


    @BeforeClass
    public void acceptCookies() {
        mainPage = open(BASE_URL_IDEALO, IdealoMainPage.class);
        mainPage.acceptCookies();

    }

    @Test
    public void searchByKeyword() {
        String option = "Preis: Höchster zuerst";

        baikesPage = mainPage.searchByKeyword("E-bikes");
        baikesPage.selectDropdownOption(option);

        baikesPage.getSelectedOption().shouldHave(Condition.attribute("selected", "selected"));

    }
}
