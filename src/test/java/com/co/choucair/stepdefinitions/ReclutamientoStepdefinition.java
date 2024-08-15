package com.co.choucair.stepdefinitions;

import com.co.choucair.interactions.Espera;
import com.co.choucair.questions.TextOf;
import com.co.choucair.tasks.FormularioCanditadoTask;
import com.co.choucair.tasks.FormularioEntrevistaTask;
import com.co.choucair.userinterfaces.MenuUserinterface;
import com.co.choucair.userinterfaces.ReclutamientoUserinterface;
import com.co.choucair.utils.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

public class ReclutamientoStepdefinition {
    @And("seleccionamos en menu la opcion recruitment")
    public void seleccionamosEnMenuLaOpcionRecruitment() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(MenuUserinterface.RECUTAMIENTO));
    }

    @And("seleccionamos el boton add")
    public void seleccionamosElBotonAdd() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BNT_ANADIR));
        Espera.esperar(3000);
    }

    @And("llenamos el formulario de add cantidate")
    public void llenamosElFormularioDeAddCantidate(DataTable dataTableNata) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioCanditadoTask.formCanditadoTask(dataTableNata));
    }

    @And("seleccionamos el boton save")
    public void seleccionamosElBotonSave() {
        Espera.esperar(5000);
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BNT_GUARDAR));
        Espera.esperar(5000);
    }

    @Then("validamos que el status este en Application Initiated")
    public void validamosQueElStatusEsteEnApplicationInitiated() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ReclutamientoUserinterface.DIV_ESTADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(ReclutamientoUserinterface.DIV_ESTADOS), Matchers.equalTo(Util.ESTADO_UNO)));
    }

    @And("buscamos la palabra clave en el filtro de cantidatos {string}")
    public void buscamosLaPalabraClaveEnElFiltroDeCantidatos(String nom) {
        OnStage.theActorInTheSpotlight().attemptsTo(Enter.theValue(nom).into(ReclutamientoUserinterface.INP_PALABRA_CLAVE));
    }


    @And("seleccionamos el boton buscar")
    public void seleccionamosElBotonBuscar() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BTN_BUSCAR_CANTIDATO));
    }

    @And("seleccionamos la opcion ver en el recurso encontrado")
    public void seleccionamosLaOpcionVerEnElRecursoEncontrado() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BTN_OJIITO));
    }

    @And("seleccionamos el boton dos")
    public void seleccionamosElBotonDos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BTN_LISTA_CORTA));
        Espera.esperar(4000);
    }

    @Then("validamos que el estado este en preseleccionada")
    public void validamosQueElEstadoEsteEnPreseleccionada() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ReclutamientoUserinterface.DIV_ESTADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(ReclutamientoUserinterface.DIV_ESTADOS), Matchers.equalTo(Util.ESTADO_DOS)));
    }

    @And("llenamos el formulario de progracion de entresvita")
    public void llenamosElFormularioDeProgracionDeEntresvita(DataTable dataTableEntrevista) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioEntrevistaTask.formularioEntrevistaTask(dataTableEntrevista));
    }

    @Then("validamos que el estado este entrevista programada")
    public void validamosQueElEstadoEsteEntrevistaProgramada() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ReclutamientoUserinterface.DIV_ESTADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(ReclutamientoUserinterface.DIV_ESTADOS), Matchers.equalTo(Util.ESTADO_TRES)));
    }

    @Then("validamos que el estado este entrevista aprobada")
    public void validamosQueElEstadoEsteEntrevistaAprobada() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ReclutamientoUserinterface.DIV_ESTADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(ReclutamientoUserinterface.DIV_ESTADOS), Matchers.equalTo(Util.ESTADO_CUATRO)));
    }

    @And("seleccionamos el boton oferta de trabajo")
    public void seleccionamosElBotonOfertaDeTrabajo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BTN_OFERTA));
    }

    @And("seleccionamos el boton contratado")
    public void seleccionamosElBotonContratado() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ReclutamientoUserinterface.BTN_CONTRATADO));
    }

    @Then("validamos que el estado este en contratado")
    public void validamosQueElEstadoEsteEnContratado() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ReclutamientoUserinterface.DIV_ESTADOS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(ReclutamientoUserinterface.DIV_ESTADOS), Matchers.equalTo(Util.ESTADO_CINCO)));
    }
}
