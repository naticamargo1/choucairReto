package com.co.choucair.stepdefinitions;

import com.co.choucair.models.DataLogearse;
import com.co.choucair.questions.TextOf;
import com.co.choucair.tasks.LoginTask;
import com.co.choucair.userinterfaces.LoguearseUserinterface;
import com.co.choucair.utils.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LoguearseStepdefinition {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Natalia");
        OnStage.theActorInTheSpotlight().can(BrowsingTheWeb.with(driver));
    }

    @Given("como usuario de la pagina web")
    public void comoUsuarioDeLaPaginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Util.URL));
    }

    @When("se ingresa las credenciales")
    public void seIngresaLasCredenciales(DataTable dataTableLogin) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.loginTask(dataTableLogin));
    }

    @Then("se realiza el login exitoso")
    public void seRealizaElLoginExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(LoguearseUserinterface.NOMBRE), Matchers.equalTo(DataLogearse.getNombreUsuario())));// compareme lo tenga xpath con lo que hay en el get
    }

}
