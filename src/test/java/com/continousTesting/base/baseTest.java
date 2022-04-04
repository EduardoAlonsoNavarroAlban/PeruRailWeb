package com.continousTesting.base;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.event.Node;
import net.serenitybdd.core.annotations.events.BeforeExample;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriverService;

/**
 * @author EduardoAlonsoNavarroAlban
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.continousTesting.base", strict = true)
public class baseTest {

    public static String ANSI_GREEN = "\u001B[32m";


    @BeforeClass
    public static void messages() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.out.println(ANSI_GREEN + "START CLASS"+ ANSI_GREEN);
    }

    @AfterClass
    public static void message() {
        System.out.println(ANSI_GREEN + "END CLASS" + ANSI_GREEN);
    }





}
