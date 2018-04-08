package ejer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public int maximoConExcepciones(){
        FileReader f; 
        BufferedReader b = null;
        
        try {
            f = new FileReader("C:/Users/test/Documents/NetBeansProjects/EjerciciosAdicionales/src/ejer1/numeros.txt");
            b = new BufferedReader(f);
        } catch (FileNotFoundException e) {
            System.out.println("could not find file");
        }
        String entero;
        boolean first = true;
        int maximun = -1;
        if (b == null) {
            return -1;
        }
        try {
            while((entero = b.readLine())!=null) {
                int e = Integer.parseInt(entero);
                if (first) {
                    maximun = e;
                    first = false;
                }
                if ( e > maximun ) {
                    maximun = e;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }
        
        return maximun;
    }
    
}
