package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDestino implements Task {

    private static String destino;

    public synchronized static void SelectDestino(String destino) {
        SelectDestino.destino = destino;
    }

    public SelectDestino(String destino) {
        SelectDestino(destino);
    }

    public static SelectDestino correctly(String destino) {
        return instrumented(SelectDestino.class, destino);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        actor.attemptsTo(
                Click.on(PeruRailPage.selectDestinoPrev.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(PeruRailPage.selectDestino(destino).waitingForNoMoreThan(Duration.ofSeconds(10)))
        );

    }
}
