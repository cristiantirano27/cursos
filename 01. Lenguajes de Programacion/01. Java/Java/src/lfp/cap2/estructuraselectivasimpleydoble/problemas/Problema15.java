/*
 * 15. Determinar si un numero entero es par o impar.
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema15 {
    public static void main(String[] args) {
        int n;
        String r = "";
    
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: \n");
        n = teclado.nextInt();
        
        if(n % 2 == 0){
            r = "PAR";
        }else{
            r = "IMPAR";
        }
        
        System.out.println("");
        System.out.println("Resultado: " + r);
    }
    
}

