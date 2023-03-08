package com.evalartapp.tasks.stepDefinitions;

import com.evalartapp.tasks.tasks.EjecucionCiclos;
import com.evalartapp.tasks.userInterfaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RealizarCiclosDePruebaStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    private LoginPage loginPage = new LoginPage();

    @Before
    public void configuracion (){
        juan.can(BrowseTheWeb.with(navegador)); }


    @When("^el usuario realiza las ejecuciones de los ciclos$")
    public void elUsuarioRealizaLasEjecucionesDeLosCiclos() {
        juan.attemptsTo(EjecucionCiclos.ejecucionCiclos());
    }
    @Then("^el usuario valida el mensaje exitoso$")
    public void elUsuarioValidaElMensajeExitoso() {

    }

}
