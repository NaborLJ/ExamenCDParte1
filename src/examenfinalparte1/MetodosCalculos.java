package examenfinalparte1;

public class MetodosCalculos {

    int i;

    public MetodosCalculos(int j, int m) {
        i = met(j, m);
    }

    public MetodosCalculos(int j) {
        i = met(j, j);
    }

    public MetodosCalculos() {
        i = -1;
    }

    public int met(int x, int x1) {
        return x + x1;
    }
}
