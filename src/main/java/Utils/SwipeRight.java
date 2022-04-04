package Utils;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.time.Duration;



public class SwipeRight implements Interaction {

    @Step("{0} swipes right screen")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Dimension size = BrowseTheWeb.as(actor).getDriver().manage().window().getSize();

        int startY = (int) (size.getHeight() / 2.0);
        int startX = (int) (size.getWidth() * 0.05);
        int endX = (int) (size.getWidth() * 0.90);

        as(actor)
                .longPress(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endX, startY))
                .release().perform();

    }

    private TouchAction as(Actor actor) {
        WebDriver driver = ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
        return new  TouchAction((MobileDriver)driver);
    }

}
