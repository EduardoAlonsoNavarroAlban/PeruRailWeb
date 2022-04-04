package com.continousTesting.base.questions.PeruRail;

import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;

public class DatosResumenImporteSalida extends WebDriverQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PeruRailPage.labelResumenImporteSalida.resolveFor(actor).getText();
    }


    public static DatosResumenImporteSalida getText() {
        return new DatosResumenImporteSalida();
    }


}
