/*
 * 13. Dado un caracter determinar si es una vocal.
 */
package lfp.cap2.estructuraselectivasimpleydoble.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema13 {
    public static void main(String [] args){
        char c;
        String r = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Caracter: \n");
        c = teclado.next().charAt(0);
        
        r = "NO ES UNA VOCAL";
        
        if(c == 'a' || c == 'A'){
            r = "ES VOCAL";
        }
        
        if(c == 'e' || c == 'E'){
            r = "ES VOCAL";
        }
        
        if(c == 'i' || c == 'I'){
            r = "ES VOCAL";
        }
        
        if(c == 'o' || c == 'O'){
            r = "ES VOCAL";
        }
        
        if(c == 'u' || c == 'U'){
            r = "ES VOCAL";
        }
        
        System.out.println("");
        System.out.println("Respuesta: " + r);
    }
}
