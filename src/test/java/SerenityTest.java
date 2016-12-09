import model.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.NavigetingUser;

import static utils.DriverUtil.getDriver;

@RunWith(SerenityRunner.class)

public class SerenityTest {

    @Managed
    private  WebDriver driver = getDriver();

    @Steps
    NavigetingUser someUser; //default package

    @Test
    public void shouldBeAbleToNavigateToAnyCategory(){
        //Given
        someUser.isOnTheHomePage();

        //When
        someUser.shouldSeePageTitleContaining("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");

        //Then
        someUser.navigatesToCategory(Category.Fashion);
    }
}
