package first_serenity.tasks;

import first_serenity.ui.CucumberStudioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenCucumberPage implements Task {

    CucumberStudioPage cucumberStudioPage;

    @Step("Open the cucumber page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(cucumberStudioPage)
        );
    }
}
