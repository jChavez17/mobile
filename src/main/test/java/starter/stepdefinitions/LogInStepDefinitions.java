package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.LoggedQuestion;
import starter.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class LogInStepDefinitions {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa sus credenciales")
    public void el_usuario_ingresa_usuario_contrasena() {
        theActorCalled("Jonathan").attemptsTo(
                new Login()
        );
    }

    @Then("el usuario visualiza los productos")
    public void visualiza_los_productos() {

        String valorEsperado = "PRODUCTS";

        theActorInTheSpotlight().should(
                seeThat("texto", LoggedQuestion.value(),
                        equalTo(valorEsperado))
        );
    }

}
