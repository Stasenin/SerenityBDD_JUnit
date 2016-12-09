package steps;

import model.Category;
import net.thucydides.core.annotations.Step;
import ui.CategoryNavigationBar;
import ui.CurrentPage;
import ui.EbayHomePage;

import static org.assertj.core.api.StrictAssertions.assertThat;


/**
 * Created by EverloNg on 08.12.2016.
 */

public class NavigetingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();

    }
    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).isEqualToIgnoringCase(expectedTitle);
    }
    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }

}
