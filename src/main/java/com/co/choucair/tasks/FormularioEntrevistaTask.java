package com.co.choucair.tasks;

import com.co.choucair.interactions.Espera;
import com.co.choucair.userinterfaces.ReclutamientoUserinterface;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormularioEntrevistaTask implements Task {
    DataTable dataTableEntrevista;

    public FormularioEntrevistaTask(DataTable dataTableEntrevista) {
        this.dataTableEntrevista = dataTableEntrevista;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataTableEntrevista.cell(0,0)).into(ReclutamientoUserinterface.INP_NOM_ENTREVISTA));
        actor.attemptsTo(Enter.theValue(dataTableEntrevista.cell(0,1)).into(ReclutamientoUserinterface.INP_ENTREVISTADOR));
        Espera.esperar(2000);
        actor.attemptsTo(Click.on(ReclutamientoUserinterface.ENTREVISTADOR));
        actor.attemptsTo(Enter.theValue(dataTableEntrevista.cell(0,2)).into(ReclutamientoUserinterface.IPN_FECHA));
    }

    public static FormularioEntrevistaTask formularioEntrevistaTask(DataTable dataTableEntrevista){
        return Tasks.instrumented(FormularioEntrevistaTask.class, dataTableEntrevista);
    }
}
