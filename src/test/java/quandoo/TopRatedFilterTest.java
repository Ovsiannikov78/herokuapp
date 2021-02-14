package quandoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.quandoo.searchpage.TopRatedFilter;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;

public class TopRatedFilterTest {
    TopRatedFilter page;

    @BeforeEach
    public void acceptCookies() {
        page = open("https://www.quandoo.de/en/berlin", TopRatedFilter.class);
        page.acceptCookies();
    }

    @Test
    public void topRatedButton() {
        page.clickTopRatedBtn();
        page.topRatedBtnAttribute().shouldHave(attribute("data-state", "active"));
        page.topRatedFilter().should(exist);
    }


}
