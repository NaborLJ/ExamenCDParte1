package examenfinalparte1;

import java.io.IOException;

public class PrintResultado {

    public static void main(String[] args) throws IOException {
       /**
        * Creaundo un objeto de tipo MetodosCalc llamamos a los metodos de dicha clase.
        * En el primer caso llamamos a SumaDosVariables, pasandole dos parametros hará la suma entre ambos.
        * Una vez realizada la suma nos muestra por pantalla el resultado.
        */
        MetodosCalc obj = new MetodosCalc();
        int n = obj.SumaDosVariables(10,20);
        System.out.println("Es: " + n);
        /**
         * Llamando al metodo SumaVariableUnica realizará un calculo enviandole una unica variable, sumando dicha variable a si misma.
         * Nos mostrará el resultado una vez realizada la operación.
         */
        MetodosCalc nm = new MetodosCalc();
        int m = nm.SumaVariableUnica(10);
        System.out.println("Es: " + m);
        /**
         * Llamando a el metodo VariableNegativa asignaremos el valor -1 a la variale int nn.
         * Mostrará por pantalla el valor de la variable nn.
         */
        MetodosCalc mn = new MetodosCalc();
        int nn = mn.VariableNegativa();
        System.out.println("Es: " + nn);
    }
}
