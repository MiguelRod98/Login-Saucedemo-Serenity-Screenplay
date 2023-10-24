package org.saucelabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.saucelabs.userinterfaces.LoginPage;


public class EnterLoginPage implements Task {

    private LoginPage loginPage;

    public static EnterLoginPage openPage() {
        return Tasks.instrumented(EnterLoginPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(loginPage)
        );
    }
}
