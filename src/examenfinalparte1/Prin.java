package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        MetodosCalculos obj = new MetodosCalculos(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        MetodosCalculos nm = new MetodosCalculos(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        MetodosCalculos mn = new MetodosCalculos();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
