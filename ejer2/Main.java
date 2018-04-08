package ejer2;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws ArgumentoIncorrectoException, IOException {
        GestorArrays ga = new GestorArrays("C:/Users/test/Documents/NetBeansProjects/EjerciciosAdicionales/src/ejer2/numeros.txt", 10);
        ga.cargarArray();
        
        System.out.println(Arrays.toString(ga.getNumeros()));
    }
    
}
