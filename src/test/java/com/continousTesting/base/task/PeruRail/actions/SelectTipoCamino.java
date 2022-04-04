package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTipoCamino implements Task {

    private static String tipoCamino;

    public synchronized static void SelectTipoCamino(String tipoCamino) {
        SelectTipoCamino.tipoCamino = tipoCamino;
    }

    public SelectTipoCamino(String tipoCamino) {
        SelectTipoCamino(tipoCamino);
    }

    public static SelectTipoCamino correctly(String tipoCamino) {
        return instrumented(SelectTipoCamino.class, tipoCamino);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);

        actor.attemptsTo(

                Click.on(PeruRailPage.selTipoCamino(tipoCamino).waitingForNoMoreThan(Duration.ofSeconds(10))));
    }
}
