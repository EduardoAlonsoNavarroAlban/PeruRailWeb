package com.continousTesting.base.task.PeruRail;

import com.continousTesting.base.page.PeruRailPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToPeruRail {

    public static Performable PeruRailWebPage() {
        return Task.where("{0} opens Peru Rail Web page", Open.browserOn().the(PeruRailPage.class));
    }

}
