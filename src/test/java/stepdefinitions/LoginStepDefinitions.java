package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.saucelabs.models.User;
import org.saucelabs.questions.AnswerLoginSuccess;
import org.saucelabs.tasks.EnterCredentials;
import org.saucelabs.tasks.EnterLoginPage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user enters the SauceLabs page$")
    public void that_the_user_enters_the_SauceLabs_page() {
        theActorCalled("Miguel").wasAbleTo(EnterLoginPage.openPage());
    }

    @When("^a user fills out the login form correctly$")
    public void a_user_fills_out_the_login_form_correctly(List<User> user) {
        theActorInTheSpotlight().attemptsTo(EnterCredentials.credentials(user));
    }

    @Then("^the login is successful$")
    public void the_login_is_successful() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLoginSuccess.response()));
    }

}
