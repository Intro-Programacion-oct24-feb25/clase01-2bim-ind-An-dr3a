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
                
        for (int i = 30; i >= 10; i--) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((i * j));
                if (j < 4) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}    
                    

               
            
                       

        

    
