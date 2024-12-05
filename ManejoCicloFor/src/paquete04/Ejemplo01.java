/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadena = "";
        
        for (int i = 10; i <= 30; i++) {
            i = i + 1;
            cadena = String.format("%d\n", i);
            System.out.printf("%s\n", cadena);
        }
            
        for (int j = 20; j <= 60; j++) {
            j = j + 2;
            cadena = String.format("%d\n", j);
            System.out.printf("%s\n", cadena);
        }
            
        for (int k = 30; k <= 90 ; k++) {
            k = k + 3;
            cadena = String.format("%d\n", k);
            System.out.printf("%s\n", cadena);
        }
            
        for (int l = 40; l <= 120 ; l++) {
            l = l + 4;
            cadena = String.format("%d\n", l);
            System.out.printf("%s\n", cadena);
        }
    }          
}    
                    

               
            
                       

        

    
