package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPasajeros implements Task {

    private static String menoresEdad;
    private static String mayoresEdad;

    public synchronized static void SelectPasajeros(String menoresEdad,String mayoresEdad) {
        SelectPasajeros.menoresEdad = menoresEdad;
        SelectPasajeros.mayoresEdad = mayoresEdad;
    }

    public SelectPasajeros(String menoresEdad,String mayoresEdad) {
        SelectPasajeros(menoresEdad,mayoresEdad);

    }

    public static SelectPasajeros correctly(String menoresEdad,String mayoresEdad) {

        return instrumented(SelectPasajeros.class, menoresEdad,mayoresEdad);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


        String IdTrenSeleccionado=getDriver().findElement(By.xpath("//select[@id='cbTrenSelect']")).getAttribute("value");
        String TrenSeleccionado=getDriver().findElement(By.xpath("//select[@id='cbTrenSelect']/option[@value="+IdTrenSeleccionado+"]")).getText();

        String IdDestinoSelecionado=getDriver().findElement(By.xpath("//select[@id='destinoSelect']")).getAttribute("value");
        String IdRuta=getDriver().findElement(By.xpath("//select[@id='rutaSelect']")).getAttribute("value");

        String DestinoSelecionado=getDriver().findElement(By.xpath("//select[@id='destinoSelect']/option[@value="+IdDestinoSelecionado+"]")).getText();
        String Ruta=getDriver().findElement(By.xpath("//select[@id='rutaSelect']/option[@value="+IdRuta+"]")).getText();


        System.out.println("DestinoSelecionado: "+DestinoSelecionado);
        System.out.println("RutaSeleccionada: "+Ruta);
        System.out.println("Tren Selecionado: "+TrenSeleccionado);




        if (TrenSeleccionado.equals("PERURAIL TITICACA TRAIN")
           ||  (DestinoSelecionado.equals("MACHU PICCHU")) ||
                (DestinoSelecionado.equals("CUSCO") && Ruta.equals("MACHU PICCHU > CUSCO")) ||
                (DestinoSelecionado.equals("CUSCO") && Ruta.equals("AREQUIPA > PUNO > CUSCO"))
        ){

            actor.attemptsTo(
                    Click.on(PeruRailPage.selectEdadPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectDismiunsionAdulto.waitingForNoMoreThan(Duration.ofSeconds(10))),

                    Enter.theValue(menoresEdad).into(PeruRailPage.txtMenoresEdad.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(mayoresEdad).into(PeruRailPage.txtMayoresEdad.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Enter.theValue(mayoresEdad).into(PeruRailPage.txtMayoresEdad.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.clicEquisEdad.waitingForNoMoreThan(Duration.ofSeconds(10)))

            );

        } else {

            System.out.println("ESTA SELECCIONADO EL ELEMENTO IDA EN LUGAR DE IDA Y VUELTA");
        }



    }



}
