package com.co.choucair.tasks;

import com.co.choucair.interactions.Espera;
import com.co.choucair.models.DataLogearse;
import com.co.choucair.userinterfaces.LoguearseUserinterface;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {

    DataTable dataTableLogin;

    public LoginTask(DataTable dataTableLogin) {
        this.dataTableLogin = dataTableLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataTableLogin.cell(0,0)).into(LoguearseUserinterface.INPUT_USUARIO));
        actor.attemptsTo(Enter.theValue(dataTableLogin.cell(0,1)).into(LoguearseUserinterface.INPUT_CONTRASENA));
        actor.attemptsTo(Click.on(LoguearseUserinterface.BTN_LOGIN));
        DataLogearse.setNombreUsuario(LoguearseUserinterface.NOMBRE.resolveFor(actor).getText());
        Espera.esperar(3000);
    }

    public static LoginTask loginTask(DataTable dataTableLogin){
        return Tasks.instrumented(LoginTask.class, dataTableLogin);
    }

}
