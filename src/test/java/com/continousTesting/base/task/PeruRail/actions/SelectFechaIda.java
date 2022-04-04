package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFechaIda implements Task {

    private static String fechaIda;

    public synchronized static void SelectFechaIda(String fechaIda) {
        SelectFechaIda.fechaIda = fechaIda;
    }

    public SelectFechaIda(String fechaIda) {
        SelectFechaIda(fechaIda);
    }

    public static SelectFechaIda correctly(String fechaIda) {
        return instrumented(SelectFechaIda.class, fechaIda);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        actor.attemptsTo(

                Click.on(PeruRailPage.selectFechaIdaPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectFechaIda(fechaIda).waitingForNoMoreThan(Duration.ofSeconds(10)))


        );
    }


}


