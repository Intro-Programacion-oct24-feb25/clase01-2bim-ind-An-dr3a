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
        int operacion;
        
        for (int i = 10; i <= 30; i++) {
            operacion = i + 1;
            cadena = String.format("%d\n", operacion);
            System.out.printf("%s\n", operacion);
        }
            
        for (int j = 20; j <= 60; j++) {
        operacion = j + 2;
        cadena = String.format("%d\n", operacion);
        System.out.printf("%s\n", operacion);
        }
            
        for (int k = 30; k <= 90 ; k++) {
        operacion = k + 3;
        cadena = String.format("%d\n", operacion);
        System.out.printf("%s\n", operacion);
        }
            
        for (int l = 40; l <= 120 ; l++) {
        operacion = l + 4;
        cadena = String.format("%d\n", operacion);
        System.out.printf("%s\n", operacion);
        }
                    
                
    }          
}    
                    

               
            
                       

        

    
