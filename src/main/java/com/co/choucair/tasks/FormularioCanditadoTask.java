package com.co.choucair.tasks;

import com.co.choucair.interactions.Espera;
import com.co.choucair.userinterfaces.ReclutamientoUserinterface;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormularioCanditadoTask implements Task {
    DataTable dataTableNata;

    public FormularioCanditadoTask(DataTable dataTableNata) {
        this.dataTableNata = dataTableNata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0,0)).into(ReclutamientoUserinterface.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0,1)).into(ReclutamientoUserinterface.INPUT_SEGUNDO_N));
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0,2 )).into(ReclutamientoUserinterface.INPUT_APELLIDO));
        actor.attemptsTo(Click.on(ReclutamientoUserinterface.DIV_VACANTE));
        actor.attemptsTo(Click.on(ReclutamientoUserinterface.VACANTE_SELECCIONADA));
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0, 3)).into(ReclutamientoUserinterface.INP_CORREO));
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0,4)).into(ReclutamientoUserinterface.INP_NUMERO));
        actor.attemptsTo(Enter.theValue(dataTableNata.cell(0,5)).into(ReclutamientoUserinterface.INP_PALABRA_CLAVE));
        actor.attemptsTo(Click.on(ReclutamientoUserinterface.CHECK_CONSENTIMIENTO));
        Espera.esperar(3000);
    }

    public static FormularioCanditadoTask formCanditadoTask(DataTable dataTableNata){
        return Tasks.instrumented(FormularioCanditadoTask.class, dataTableNata);
    }
}
