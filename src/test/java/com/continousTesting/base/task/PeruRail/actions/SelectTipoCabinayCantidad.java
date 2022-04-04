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

public class SelectTipoCabinayCantidad implements Task {

    private static String tipoCabina;
    private static String cantidadCabinas;

    public synchronized static void SelectTipoCabinayCantidad(String tipoCabina, String cantidadCabinas) {
        SelectTipoCabinayCantidad.tipoCabina = tipoCabina;
        SelectTipoCabinayCantidad.cantidadCabinas = cantidadCabinas;
    }

    public SelectTipoCabinayCantidad(String tipoCabina, String cantidadCabinas) {
        SelectTipoCabinayCantidad(tipoCabina, cantidadCabinas);

    }

    public static SelectTipoCabinayCantidad correctly(String tipoCabina, String cantidadCabinas) {

        return instrumented(SelectTipoCabinayCantidad.class, tipoCabina, cantidadCabinas);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        String MENSAJE_NO_DISPONIBILIDAD_CABINAS1="No cabins available for the selected date";
        String MENSAJE_NO_DISPONIBILIDAD_CABINAS2="No hay disponibilidad de cabinas para la fecha seleccionada";
        String MENSAJE_CABINAS =getDriver().findElement(By.xpath("//body/section[@id='wrapper']/section[@id='content']/section[@id='motor']/form[@id='frm_viajes_bae']/div[3]/div[2]/div[2]/div[3]/div[1]")).getText();

        if(MENSAJE_CABINAS.equals(MENSAJE_NO_DISPONIBILIDAD_CABINAS1) || MENSAJE_CABINAS.equals(MENSAJE_NO_DISPONIBILIDAD_CABINAS2))
        {
            System.out.println("NO HAY CABINAS DISPONIBLES PARA ESE DIA");
        } else{

            actor.attemptsTo(
                    Click.on(PeruRailPage.selectCantidadCabinaPrev(tipoCabina).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectCantidadCabina(tipoCabina, cantidadCabinas).waitingForNoMoreThan(Duration.ofSeconds(10)))

            );

        }




    }
}