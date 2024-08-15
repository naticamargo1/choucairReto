package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoguearseUserinterface {
    public static final Target INPUT_USUARIO = Target.the("ingreso el usuario")
            .locatedBy("//input[@name='username']");

    public static final Target INPUT_CONTRASENA = Target.the("ingreso el usuario")
            .locatedBy("//input[@name='password']");

    public static final Target BTN_LOGIN = Target.the("boton de login")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public static final Target NOMBRE = Target.the("validacion de login")
            .locatedBy("//p[@class='oxd-userdropdown-name']");
}
