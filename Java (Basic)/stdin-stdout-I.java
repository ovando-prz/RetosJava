/*
 * Task:
 * In this challenge, you must read  integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line. 
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Creacion de objeto clase 'Scanner' para leer la entrada del usuario desde el teclado. El objeto 'Scanner' se asigna a la variable 'myScanner'.
        Scanner myScanner = new Scanner(System.in);

        //Lectura y almacenamiento de la entrada del usuario.
        int fstInt = myScanner.nextInt();
        int sndInt = myScanner.nextInt();
        int trdInt = myScanner.nextInt();

        //Cierre de objeto 'Scanner' para liberar recursos del sistema.
        myScanner.close();

        //Impresion de cada una de las intergers, una por linea.
        System.out.println(fstInt);
        System.out.println(sndInt);
        System.out.println(trdInt);

    }
}