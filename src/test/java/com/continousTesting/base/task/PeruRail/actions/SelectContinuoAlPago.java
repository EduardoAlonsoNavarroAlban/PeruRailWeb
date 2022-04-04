package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectContinuoAlPago implements Task {


    public static SelectContinuoAlPago correctly() {
        return instrumented(SelectContinuoAlPago.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


            actor.attemptsTo(
                    Click.on(PeruRailPage.btnContinuarAlPago.waitingForNoMoreThan(Duration.ofSeconds(10)))
            );




    }

}
