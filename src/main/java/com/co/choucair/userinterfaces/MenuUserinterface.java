package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuUserinterface {

    public static final Target RECUTAMIENTO = Target.the("ingreso al reclutamiento")
            .locatedBy("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']");
}
