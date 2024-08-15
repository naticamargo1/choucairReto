package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReclutamientoUserinterface {

    public static final Target BNT_ANADIR = Target.the("boton desplegar formulario")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public static final Target INPUT_NOMBRE = Target.the("campo para ingresa nombre")
            .locatedBy("//input[@name='firstName']");

    public static final Target INPUT_SEGUNDO_N = Target.the("campo para ingresar segundo nombre")
            .locatedBy("//input[@name='middleName']");

    public static final Target INPUT_APELLIDO = Target.the("campo para ingresar primer apellido")
            .locatedBy("//input[@name='lastName']");

    public static final Target DIV_VACANTE = Target.the("Selector para abrir la lista de vacantes")
            .locatedBy("//div[@class='oxd-select-wrapper']");

    public static final Target VACANTE_SELECCIONADA = Target.the("Selector del campo vacancy")
            .locatedBy("//*[contains(text(),'Payroll Administrator')]");

    public static final Target INP_CORREO = Target.the("Campo para ingresar correo")
            .locatedBy("(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@placeholder='Type here'])[1]");

    public static final Target INP_NUMERO = Target.the("Campo para ingresar numero")
            .locatedBy("(//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@placeholder='Type here'])[2]");

    public static final Target INP_PALABRA_CLAVE = Target.the("Campo para ingresar palabra clave")
            .locatedBy("//input[@placeholder='Enter comma seperated words...']");

    public static final Target CHECK_CONSENTIMIENTO = Target.the("Campo del concentimiento de datos")
            .locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");

    public static final Target BNT_GUARDAR = Target.the("Campo para guardar el formulario")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target DIV_ESTADOS = Target.the("Campo para validar los estados")
            .locatedBy("//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']");

    public static final Target DIV_NOMBRE_CANDITADO = Target.the("Campo para ingresar el nombre del cantidao a buscar")
            .locatedBy("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input");

    public static final Target BTN_BUSCAR_CANTIDATO = Target.the("Campo para buscar el canditado")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target BTN_OJIITO = Target.the("Campo del ojito")
            .locatedBy("//button[@class='oxd-icon-button oxd-table-cell-action-space']");

    public static final Target BTN_LISTA_CORTA = Target.the("boton de lista corta")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--success']");

    public static final Target INP_NOM_ENTREVISTA = Target.the("Campo para ingresar el nombre de la entrevista programada")
            .locatedBy("(//div[@class='oxd-form-row'])[2]/div/div/div/div/input[@class='oxd-input oxd-input--active']");

    public static final Target INP_ENTREVISTADOR = Target.the("Campo para ingresar el nombre del entrevistador")
            .locatedBy("(//div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2'])[4]/div/div/div/div/div/input");

    public static final Target ENTREVISTADOR = Target.the("Campo para seleccionar el entrevistador")
            .locatedBy("//div[@class='oxd-autocomplete-dropdown --positon-bottom']");

    public static final Target IPN_FECHA = Target.the("Campo para ingresar la fecha")
            .locatedBy("(//div[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2'])[5]/div/div/div/div/input");

    public static final Target BTN_OFERTA = Target.the("Boton oferta de trabajo")
            .locatedBy("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]");

    public static final Target BTN_CONTRATADO = Target.the("Boton de contratado")
            .locatedBy("/html/body/div/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]");
}
