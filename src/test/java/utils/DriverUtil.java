package utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtil {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                return driver;

            } catch (Exception e) {
                System.out.println("Wrong Web Driver URL provided");
                e.printStackTrace();
            }

        }
        return null;
    }


}
