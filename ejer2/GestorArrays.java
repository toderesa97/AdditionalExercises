package ejer2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.beans.property.IntegerProperty;

public class GestorArrays {
    private int [] numeros;
    private int elem;
    private String nombre;
    private BufferedReader fichero;
    private PrintWriter ficheroSalida;
    
    public GestorArrays(String nombre, int elem) throws ArgumentoIncorrectoException {
        this.nombre = nombre;
        if (elem <= 0) {
            throw new ArgumentoIncorrectoException("Illegal size for array ("+elem+")");
        } else {
            this.elem = elem;
            numeros = new int[elem];
        }
    }
    
    public void cargarArray() throws FileNotFoundException, IOException{
        FileReader f = new FileReader(nombre);
        fichero = new BufferedReader(f);
        String line;
        int limit = elem;
        while((line = fichero.readLine()) != null && limit-- > 0) {
            numeros[elem-limit-1] = Integer.parseInt(line);
        }
            
    }
    
    public int[] getNumeros() {
        return numeros;
    }
    
}
