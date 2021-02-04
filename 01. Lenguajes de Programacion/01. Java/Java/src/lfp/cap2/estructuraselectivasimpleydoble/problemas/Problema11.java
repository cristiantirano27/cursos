/*
 * 11. Dados dos numeros enteros diferentes, devolver el numero entero mayor 
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema11 {
    public static void main(String [] args){
        int n1, n2, m=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: \n");
        n1 = teclado.nextInt();
        System.out.print("Numero 2: \n");
        n2 = teclado.nextInt();
        
        if(n1 > n2){
            m = n1;
        }
        if(n2 > n1){
            m = n2;
        }
        
        System.out.println("");
        System.out.println("Mayor: " + m);
    }
}
