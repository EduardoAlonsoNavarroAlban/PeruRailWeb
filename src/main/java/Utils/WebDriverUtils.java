package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WebDriverUtils {

    public static String getHandle(WebDriver driver, String parentWinHandle) {
        Set<String> winHandles = driver.getWindowHandles();
        for (String handle : winHandles) {
            if (!handle.equals(parentWinHandle)) {
                return handle;
            }
        }
        return "No tiene ventanas";
    }

}
