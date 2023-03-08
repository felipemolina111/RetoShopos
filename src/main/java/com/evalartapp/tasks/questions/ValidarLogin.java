package com.evalartapp.tasks.questions;


import com.evalartapp.tasks.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogin implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.IMG_EVALART.resolveFor(actor).isVisible();
    }


    public static Question validarLogin(){ return new ValidarLogin(); }


}