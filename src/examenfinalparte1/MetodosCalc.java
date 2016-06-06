package examenfinalparte1;

public class MetodosCalc {

    int i;
    /**
     * Pasandole los parámetros j y m de tipo int realiza una operación mediante el método SumaPrincipal con los datos enviados.
     * Una vez realizada la operación asigna el resultado a la variable i.
     * @param j variable de tipo int
     * @param m variable de tipo int
     */
    public void SumaDosVariables(int j, int m) {
        i = SumaPrincipal(j, m);
    }
    /**
     * Pasandole unicamente el parametro j realizará la operación del metodo SumaPrincipal,en este caso, sumará j+j.
     * Recoge el resultado de la operación en la variable i.
     * @param j variable de tipo int
     */
    public void SumaVariableUnica(int j) {
        i = SumaPrincipal(j, j);
    }
    /**
     * Asigna como valor a la variable i,-1.
     */
    public void VariableNegativa() {
        i = -1;
    }
    /**
     * Método que contiene la operación principal, a partir de este método realizaremos los demás.
     * Realiza una suma mediante 2 variable x y x1.
     * @param x variable de tipo int
     * @param x1 variable de tipo int
     * @return 
     */
    public int SumaPrincipal(int x, int x1) {
        return x + x1;
    }
}
