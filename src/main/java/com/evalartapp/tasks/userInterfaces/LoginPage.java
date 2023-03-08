package com.evalartapp.tasks.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")

public class LoginPage extends PageObject {

    public static final Target LBL_USUARIO = net.serenitybdd.screenplay.targets.Target.the("usuario").located(By.xpath("//input[@name='username']"));
    public static final Target LBL_CLAVE = net.serenitybdd.screenplay.targets.Target.the("contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").located(By.xpath("//button[@type='submit']"));


}
