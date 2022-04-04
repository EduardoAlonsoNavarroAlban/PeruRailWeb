package com.continousTesting.base.task.PeruRail.actions;

import Utils.Pause;
import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTrenIdaRegreso implements Task {

    private static String trenIda;
    private static String trenRegreso;

    public synchronized static void SelectTrenIdaRegreso(String trenIda, String trenRegreso) {
        SelectTrenIdaRegreso.trenIda = trenIda;
        SelectTrenIdaRegreso.trenRegreso = trenRegreso;
    }

    public SelectTrenIdaRegreso(String trenIda, String trenRegreso) {
        SelectTrenIdaRegreso(trenIda, trenRegreso);

    }

    public static SelectTrenIdaRegreso correctly(String trenIda, String trenRegreso) {

        return instrumented(SelectTrenIdaRegreso.class, trenIda, trenRegreso);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Pause.pause(1);


            actor.attemptsTo(
                    Click.on(PeruRailPage.selectTrenIda(trenIda).waitingForNoMoreThan(Duration.ofSeconds(10))),
                    Click.on(PeruRailPage.selectTrenRegreso(trenRegreso).waitingForNoMoreThan(Duration.ofSeconds(10)))

            );






    }


}
