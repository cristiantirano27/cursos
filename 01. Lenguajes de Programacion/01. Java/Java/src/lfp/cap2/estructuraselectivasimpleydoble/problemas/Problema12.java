/*
 * 12. Determinar si un numero entero es positivo, negativo o neuro.
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema12 {
    public static void main(String [] args){
        int n;
        String r = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: \n");
        n = teclado.nextInt();
        
        if(n > 0){
            r = "POSITIVO";
        }
        if(n < 0){
            r = "NEGATIVO";
        }
        if(n == 0){
            r = "NEUTRO";
        }
        
        System.out.println("");
        System.out.println("Resultado: " + r);
    }
}
