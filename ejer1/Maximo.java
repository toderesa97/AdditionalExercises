package ejer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Maximo {

    public Maximo() {
    }


    public int minimoSinExcepciones() throws FileNotFoundException, NumberFormatException, IOException{
        
        FileReader f = new FileReader("C:/Users/test/Documents/NetBeansProjects/EjerciciosAdicionales/src/ejer1/numeros.txt");
        BufferedReader b = new BufferedReader(f);
        String entero;
        boolean first = true;
        int minimum = 0;
        while((entero = b.readLine())!=null) {
            int e = Integer.parseInt(entero);
            if (first) {
                minimum = e;
                first = false;
            }
            if ( e < minimum ) {
                minimum = e;
            }
        }
        return minimum;
    }
    
    

}
