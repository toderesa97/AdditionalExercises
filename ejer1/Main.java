package ejer1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, NumberFormatException, IOException{
        Maximo max = new Maximo();
        System.out.println(max.minimoSinExcepciones());
        System.out.println(max.maximoConExcepciones());
    }
}
