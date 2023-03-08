package com.evalartapp.tasks.stepDefinitions;

import com.evalartapp.tasks.questions.ValidarLogin;
import com.evalartapp.tasks.tasks.Login;
import com.evalartapp.tasks.userInterfaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    private LoginPage loginPage = new LoginPage();

    @Before
    public void configuracion (){
        juan.can(BrowseTheWeb.with(navegador)); }

    @Given("^el usuario se encuentra en la pagina de inicio$")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicio() {
        juan.wasAbleTo(Open.browserOn(loginPage));
    }

    @When("^el usuario ingrese el usuario, contraseña y de click en el botón ingresar$")
    public void elUsuarioIngreseElUsuarioContraseñaYDeClickEnElBotónIngresar() {
        juan.attemptsTo(Login.login());
    }

    @Then("^el usuario visualiza la pantalla inicial$")
    public void elUsuarioVisualizaLaPantallaInicial() {
        juan.should(GivenWhenThen.seeThat("El usuario valida que el mensaje se muestra", ValidarLogin.validarLogin(), Matchers.equalTo(true)));

    }


}
