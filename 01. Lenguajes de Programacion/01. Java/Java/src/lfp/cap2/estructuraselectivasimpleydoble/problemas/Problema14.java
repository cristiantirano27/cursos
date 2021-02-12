/*
 * 14. Determinar si un numero es multiplo de 3 y 5.
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema14 {
    public static void main(String [] args){
        int n;
        String r = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: \n");
        n = teclado.nextInt();
        
        if(n % 3 == 0 & n % 5 == 0){
            r = "SI ES MULTIPLO DE 3 Y 5";
        }else{
            r = "NO ES MULTIPLO DE 3 Y 5";
        }
        
        System.out.println("");
        System.out.println("Resultado: " + r);
    }
}
