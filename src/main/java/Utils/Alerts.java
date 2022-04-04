package Utils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Alerts  {

    public static void alertAccept(){
        try {
            WebElement element = getDriver().findElement(By.xpath("(//td[contains(@class,'mat-column-Acciones')]//mat-icon[contains(@class,'mat-warn')])[1]"));
            element.click();
            WebDriverWait wait = new WebDriverWait(getDriver(), 4);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = getDriver().switchTo().alert();
            System.out.println("Text alert "+alert.getText());
            alert.accept();
        }
        catch (Exception e){
            System.out.println("Error "+e);
        }
    }
}