/*
 * 16. Dado 3 numeros enteros, devolver el numero mayor. 
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema16 {
    public static void main(String[] args) {
        int n1, n2, n3, m;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero 1: \n");
        n1 = teclado.nextInt();
        System.out.print("Numero 2: \n");
        n2 = teclado.nextInt();
        System.out.print("Numero 3: \n");
        n3 = teclado.nextInt();
        
        if(n1 > n2){
            if(n1 > n3){
                m = n1;
            }else{
                m = n3;
            }
        }else{
            if(n2 > n3){
                m = n2;
            }else{
                m = n3;
            }
        }
        
        System.out.println("");
        System.out.println("Mayor: " + m);
    }
}
