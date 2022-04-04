package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFechaRetorno implements Task {

    private static String fechaRetorno;

    public synchronized static void SelectFechaRetorno(String fechaRetorno) {
        SelectFechaRetorno.fechaRetorno = fechaRetorno;
    }

    public SelectFechaRetorno(String fechaRetorno) {
        SelectFechaRetorno(fechaRetorno);
    }

    public static SelectFechaRetorno correctly(String fechaRetorno) {
        return instrumented(SelectFechaRetorno.class, fechaRetorno);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


        if (getDriver().findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/label[1]")).isDisplayed()){

            actor.attemptsTo(
                    Click.on(PeruRailPage.selectFechaRetornoPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectFechaRetorno(fechaRetorno).waitingForNoMoreThan(Duration.ofSeconds(10)))

            );

        } else {


            System.out.println("NO ESTA SELECCIONADO IDA Y VUELTA");
        }






    }


}
