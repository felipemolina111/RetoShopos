package com.evalartapp.tasks.questions;

import com.evalartapp.tasks.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPruebaExitosa implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.TXT_PRUEBA_EXITOSA.resolveFor(actor).isVisible();
    }
    public static Question validarPruebaExitosa(){ return new ValidarPruebaExitosa(); }
}
