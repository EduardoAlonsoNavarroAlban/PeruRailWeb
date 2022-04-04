package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRuta implements Task {

    private static String ruta;

    public synchronized static void SelectRuta(String ruta) {
        SelectRuta.ruta = ruta;
    }

    public SelectRuta(String ruta) {
        SelectRuta(ruta);
    }

    public static SelectRuta correctly(String ruta) {
        return instrumented(SelectRuta.class, ruta);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        actor.attemptsTo(

                Click.on(PeruRailPage.selectRutaPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectRuta(ruta).waitingForNoMoreThan(Duration.ofSeconds(10)))
                );

    }

}
