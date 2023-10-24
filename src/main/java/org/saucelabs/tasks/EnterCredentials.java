package org.saucelabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.saucelabs.models.User;

import java.util.List;

import static org.saucelabs.userinterfaces.LoginPage.*;

public class EnterCredentials implements Task {

    List<User> user;

    public EnterCredentials(List<User> user) {
        this.user = user;
    }

    public static EnterCredentials credentials(List<User> user) {
        return Tasks.instrumented(EnterCredentials.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.get(0).getUsername()).into(USERNAME_INPUT),
                Enter.theValue(user.get(0).getPassword()).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }
}
