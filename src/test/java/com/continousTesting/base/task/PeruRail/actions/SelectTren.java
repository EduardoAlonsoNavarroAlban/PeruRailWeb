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

public class SelectTren implements Task {

    private static String tren;

    public synchronized static void SelectTren(String tren) {
        SelectTren.tren = tren;
    }

    public SelectTren(String tren) {
        SelectTren(tren);
    }

    public static SelectTren correctly(String tren) {
        return instrumented(SelectTren.class, tren);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        String IdDestinoSelecionado=getDriver().findElement(By.xpath("//select[@id='destinoSelect']")).getAttribute("value");
        String IdRuta=getDriver().findElement(By.xpath("//select[@id='rutaSelect']")).getAttribute("value");

        String DestinoSelecionado=getDriver().findElement(By.xpath("//select[@id='destinoSelect']/option[@value="+IdDestinoSelecionado+"]")).getText();
        String Ruta=getDriver().findElement(By.xpath("//select[@id='rutaSelect']/option[@value="+IdRuta+"]")).getText();


        System.out.println("DestinoSelecionado: "+DestinoSelecionado);
        System.out.println("RutaSeleccionada: "+Ruta);

        if (
                (DestinoSelecionado.equals("MACHU PICCHU")) ||
                 (DestinoSelecionado.equals("CUSCO") && Ruta.equals("MACHU PICCHU > CUSCO")) ||
                 (DestinoSelecionado.equals("CUSCO") && Ruta.equals("AREQUIPA > PUNO > CUSCO"))
            )
        {

            System.out.println("NO CUMPLE CON LA CONDICION DE SELECCION DE TREN");

        } else {

            actor.attemptsTo(
                    Click.on(PeruRailPage.selectTrenPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectTren(tren).waitingForNoMoreThan(Duration.ofSeconds(10)))
            );


        }




    }
}
