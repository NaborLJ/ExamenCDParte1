package examenfinalparte1;

public class MetodosCalc {

    int i;
  
    public MetodosCalc(int j, int m) {
        i = SumaPrincipal(j, m);
    }
    
    public MetodosCalc(int j) {
        i = SumaPrincipal(j, j);
    }
    
    public MetodosCalc() {
        i = -1;
    }

    public int SumaPrincipal(int x, int x1) {
        return x + x1;
    }
}
