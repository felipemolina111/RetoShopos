package com.evalartapp.tasks.tasks;

import com.evalartapp.tasks.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.evalartapp.tasks.userInterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EjecucionCiclos implements Task {

    int posicion;
    int a;
    int b;
    int c;
    int suma;
    String stringSuma;
   int esquina1;
   int esquina2;
   int esquina3;
   int esquina4;


    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean pruebaExitosa = false;



        do {


            String prueba = HomePage.TXT_COORDENADAS.resolveFor(actor).getText();
            String[] array = prueba.split("\\)");

            String[] array1 = array[0].split(",");
            String[] array2 = array[1].split(",");
            String[] array3 = array[2].split(",");
            String[] array4 = array[3].split(",");
            String[] array5 = array[4].split(",");


            int aux1 = Integer.valueOf(array1[1]);
            int aux2 = Integer.valueOf(array2[1]);
            int aux3 = Integer.valueOf(array3[1]);
            int aux4 = Integer.valueOf(array4[1]);
            int aux5 = Integer.valueOf(array5[1]);

            int coordenadaY = aux1 + aux2 + aux3 + aux4 + aux5;

        //----------------------------------------------------------------------------------------

            String[] array11 = array1[0].split("\\(");
            String[] array22 = array2[0].split("\\(");
            String[] array33 = array3[0].split("\\(");
            String[] array44 = array4[0].split("\\(");
            String[] array55 = array5[0].split("\\(");

            int aux11 = Integer.valueOf(array11[1]);
            int aux22 = Integer.valueOf(array22[1]);
            int aux33 = Integer.valueOf(array33[1]);
            int aux44 = Integer.valueOf(array44[1]);
            int aux55 = Integer.valueOf(array55[1]);

            int coordenadaX = aux11 + aux22 + aux33 + aux44 + aux55;


            if(BTN_196.resolveFor(actor).isVisible() == true){

               posicion = (14 * coordenadaY) + coordenadaX + 1;
               a=13;
               b=14;
               c=15;
                esquina1 = 1;
                esquina2 = 14;
                esquina3 = 183;
                esquina4 = 196;
            }
            else {
                posicion = (12 * coordenadaY) + coordenadaX + 1;
                a=11;
                b=12;
                c=13;
                esquina1 = 1;
                esquina2 = 12;
                esquina3 = 133;
                esquina4 = 144;
            }

            String stringPosicion = String.valueOf(posicion);


//-----------------------------------------------------------------------------------------------


            String[] primerFila = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
            String[] ultimaFila = {"184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195" };
            String[] primerColumna = {"15", "29", "43", "57", "71", "85", "99", "113", "127", "141", "155", "169" };
            String[] ultimaColumna = {"28", "42", "56", "70", "84", "98", "112", "126", "140", "154", "168", "182" };



//-----------------------------------------------------------------------------------
            boolean primeraFilaAux = false;
            for (int i = 0; i == (primerFila.length - 1); i++) {
                if (stringPosicion == primerFila[i]) {
                    primeraFilaAux = true;
                }
            }
//-----------------------------------------------------------------------------------
            boolean ultimaFilaAux = false;
            for (int j = 0; j == (ultimaFila.length - 1); j++) {
                if (stringPosicion == ultimaFila[j]) {
                    ultimaFilaAux = true;
                }
            }
//-----------------------------------------------------------------------------------

            boolean primerColumnaAux = false;
            for (int k = 0; k == (primerColumna.length - 1); k++) {
                if (stringPosicion == primerColumna[k]) {
                    primerColumnaAux = true;
                }
            }
//-----------------------------------------------------------------------------------

            boolean ultimaColumnaAux = false;
            for (int l = 0; l == (primerColumna.length - 1); l++) {
                if (stringPosicion == ultimaColumna[l]) {
                    ultimaColumnaAux = true;
                }
            }
//-----------------------------------------------------------------------------------
            if (primeraFilaAux == true) {

                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion + 1);
                String bandera3 = String.valueOf(posicion + a);
                String bandera4 = String.valueOf(posicion + b);
                String bandera5 = String.valueOf(posicion + c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(bandera4).resolveFor(actor).getText());
                int valorBandera5 = Integer.valueOf(POSICION_BOTON(bandera5).resolveFor(actor).getText());
                int valorBandera6 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4 + valorBandera5 + valorBandera6;
                stringSuma = String.valueOf(suma);
            }

        //-----------------------------------------------------------------------------------

            if (ultimaFilaAux == true) {

                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion + 1);
                String bandera3 = String.valueOf(posicion - a);
                String bandera4 = String.valueOf(posicion - b);
                String bandera5 = String.valueOf(posicion - c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(bandera4).resolveFor(actor).getText());
                int valorBandera5 = Integer.valueOf(POSICION_BOTON(bandera5).resolveFor(actor).getText());
                int valorBandera6 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                 suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4 + valorBandera5 + valorBandera6;
                 stringSuma = String.valueOf(suma);

            }

        //-----------------------------------------------------------------------------------

            //-----------------------------------------------------------------------------------

            if (primerColumnaAux == true) {

                String bandera1 = String.valueOf(posicion + 1);
                String bandera2 = String.valueOf(posicion - a);
                String bandera3 = String.valueOf(posicion - b);
                String bandera4 = String.valueOf(posicion + b);
                String bandera5 = String.valueOf(posicion + c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(bandera4).resolveFor(actor).getText());
                int valorBandera5 = Integer.valueOf(POSICION_BOTON(bandera5).resolveFor(actor).getText());
                int valorBandera6 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                 suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4 + valorBandera5 + valorBandera6;
                stringSuma = String.valueOf(suma);

            }

        //-----------------------------------------------------------------------------------


            if (ultimaColumnaAux == true) {

                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion + a);
                String bandera3 = String.valueOf(posicion + b);
                String bandera4 = String.valueOf(posicion - b);
                String bandera5 = String.valueOf(posicion - c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(bandera4).resolveFor(actor).getText());
                int valorBandera5 = Integer.valueOf(POSICION_BOTON(bandera5).resolveFor(actor).getText());
                int valorBandera6 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4 + valorBandera5 + valorBandera6;
                 stringSuma = String.valueOf(suma);
            }

        //-----------------------------------------------------------------------------------

            if (posicion == esquina1) {

                String bandera1 = String.valueOf(posicion + 1);
                String bandera2 = String.valueOf(posicion + b);
                String bandera3 = String.valueOf(posicion + c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4;
                 stringSuma = String.valueOf(suma);

            }
        //-----------------------------------------------------------------------------------------------
            if (posicion == esquina2) {

                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion + a);
                String bandera3 = String.valueOf(posicion + b);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                 suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4;
                 stringSuma = String.valueOf(suma);

            }
        //-------------------------------------------------------------------------------------------------------------

            if (posicion == esquina3) {

                String bandera1 = String.valueOf(posicion + 1);
                String bandera2 = String.valueOf(posicion - a);
                String bandera3 = String.valueOf(posicion - b);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

                 suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4;
                stringSuma = String.valueOf(suma);

            }
        //---------------------------------------------------------


            if (posicion == esquina4) {

                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion - b);
                String bandera3 = String.valueOf(posicion - c);

                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getText());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getText());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getText());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getText());

               suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4;
                stringSuma = String.valueOf(suma);

                }

        //---------------------------------------------------------


            else {
                String bandera1 = String.valueOf(posicion - 1);
                String bandera2 = String.valueOf(posicion + 1);
                String bandera3 = String.valueOf(posicion - c);
                String bandera4 = String.valueOf(posicion - b);
                String bandera5 = String.valueOf(posicion - a);
                String bandera6 = String.valueOf(posicion + a);
                String bandera7 = String.valueOf(posicion + b);
                String bandera8 = String.valueOf(posicion + c);


                int valorBandera1 = Integer.valueOf(POSICION_BOTON(bandera1).resolveFor(actor).getValue());
                int valorBandera2 = Integer.valueOf(POSICION_BOTON(bandera2).resolveFor(actor).getValue());
                int valorBandera3 = Integer.valueOf(POSICION_BOTON(bandera3).resolveFor(actor).getValue());
                int valorBandera4 = Integer.valueOf(POSICION_BOTON(bandera4).resolveFor(actor).getValue());
                int valorBandera5 = Integer.valueOf(POSICION_BOTON(bandera5).resolveFor(actor).getValue());
                int valorBandera6 = Integer.valueOf(POSICION_BOTON(bandera6).resolveFor(actor).getValue());
                int valorBandera7 = Integer.valueOf(POSICION_BOTON(bandera7).resolveFor(actor).getValue());
                int valorBandera8 = Integer.valueOf(POSICION_BOTON(bandera8).resolveFor(actor).getValue());
                int valorBandera9 = Integer.valueOf(POSICION_BOTON(stringPosicion).resolveFor(actor).getValue());

                suma = valorBandera1 + valorBandera2 + valorBandera3 + valorBandera4 + valorBandera5
                        + valorBandera6 + valorBandera7 + valorBandera8 + valorBandera9;
                 stringSuma = String.valueOf(suma);

                }

        actor.attemptsTo(
                JavaScriptClick.on(POSICION_BOTON(stringPosicion)),
                WaitUntil.the(LBL_SUMA_TOTAL, isVisible()).forNoMoreThan(4).seconds());

        if(TXT_ERROR.resolveFor(actor).isVisible() == false) {

            actor.attemptsTo(
                    Enter.theValue(stringSuma).into(LBL_SUMA_TOTAL),
                    Click.on(BTN_ENVIAR));
        }

            if (TXT_PRUEBA_EXITOSA.resolveFor(actor).isVisible() == true) {
                pruebaExitosa = true;
            }

        } while (pruebaExitosa  == false);

    }
    public static EjecucionCiclos ejecucionCiclos(){return instrumented (EjecucionCiclos.class);}
}
