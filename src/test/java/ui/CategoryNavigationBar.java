package ui;

import model.Category;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

/**
 * Created by EverloNg on 08.12.2016.
 */
public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
    findBy("//tr[@role='list']").find(By.linkText(category.name())).sendKeys(Keys.ENTER);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
