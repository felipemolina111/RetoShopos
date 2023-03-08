package com.evalartapp.tasks.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target IMG_EVALART = Target.the("imagen inicial Evalart").located(By.xpath("//img[@src='https://evalartapp.com/img/presentacionmin.png']"));
    public static final Target TXT_COORDENADAS = Target.the("Coordenadas").located(By.xpath("//p[@class='text-center text-xl font-bold']"));
    public static final Target LBL_SUMA_TOTAL = Target.the("Coordenadas").located(By.xpath("//input[@placeholder='Suma total']"));
    public static final Target BTN_ENVIAR = Target.the("Coordenadas").located(By.xpath("//button[@type='submit']"));
    public static final Target TXT_PRUEBA_EXITOSA = Target.the("Coordenadas").located(By.xpath("//h1[text()='Felicidades, has terminado la prueba exitosamente']"));
    public static final Target TXT_ERROR = Target.the("Coordenadas").located(By.xpath("//p[text()='Ha cometido un error, intente de nuevo']"));
    public static final Target BTN_196 = Target.the("Coordenadas").located(By.xpath("(//button)[196]"));

    public static Target POSICION_BOTON(String posicion) {
        return Target.the("Click en el botón de la posicion calculada").located(org.openqa.selenium.By.xpath("(//button)["+posicion+"]"));
    }

}
