package quandoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.quandoo.searchpage.CuisineFilter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class CuisineFilterTest {

    CuisineFilter page;

    @BeforeEach
    public void acceptCookies() {
        page = open("https://www.quandoo.de/en/berlin", CuisineFilter.class);
        page.acceptCookies();

    }

    @Test
    public void cuisineFilter() {
        page.selectRestaurantCategory();
        page.restaurantCategory().shouldHave(text("African"));
        page.restaurantCounter().shouldHave(text("7"));
    }
}
