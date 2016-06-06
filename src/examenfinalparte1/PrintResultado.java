package examenfinalparte1;

import java.io.IOException;

public class PrintResultado {

    public static void main(String[] args) throws IOException {
        MetodosCalc obj = new MetodosCalc(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        MetodosCalc nm = new MetodosCalc(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        MetodosCalc mn = new MetodosCalc();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
