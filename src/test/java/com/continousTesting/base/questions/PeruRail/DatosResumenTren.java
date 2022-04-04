package com.continousTesting.base.questions.PeruRail;

import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;

public class DatosResumenTren extends WebDriverQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PeruRailPage.labelResumenTren.resolveFor(actor).getText();
    }


    public static DatosResumenTren getText() {
        return new DatosResumenTren();
    }


}
