package examenfinalparte1;

public class MetodosCalc {

    int i;
    /**
     * Pasandole los parámetros j y m de tipo int realiza una operación mediante el método SumaPrincipal con los datos enviados.
     * Una vez realizada la operación asigna el resultado a la variable i.
     * @param j variable de tipo int
     * @param m variable de tipo int
     * @return Retornamos la variable i con el valor asignado.
     */
    public int SumaDosVariables(int j, int m) {
        i = SumaPrincipal(j, m);
        return i;
    }
    /**
     * Pasandole unicamente el parametro j realizará la operación del metodo SumaPrincipal,en este caso, sumará j+j.
     * Recoge el resultado de la operación en la variable i.
     * @param j variable de tipo int
     * @return Retornamos la variable i con el valor asignado
     */
    public int  SumaVariableUnica(int j) {
        i = SumaPrincipal(j, j);
        return i;
    }
    /**
     * Asigna como valor a la variable i,-1.
     * @return Retornamos la variable i con el valor asignado
     */
    public int VariableNegativa() {
        i = -1;
        return i;
    }
    /**
     * Método que contiene la operación principal, a partir de este método realizaremos los demás.
     * Realiza una suma mediante 2 variable x y x1.
     * @param x variable de tipo int
     * @param x1 variable de tipo int
     * @return retorna la suma de x+x1
     */
    public int SumaPrincipal(int x, int x1) {
        return x + x1;
    }
}
