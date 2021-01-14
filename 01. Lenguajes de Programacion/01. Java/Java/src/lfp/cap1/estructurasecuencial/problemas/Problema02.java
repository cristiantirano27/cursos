/*
 * Hallar el cociente y el residuo (resto) de dos numeros enteros.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema02 {
    public static void main(String[] args) {
	int n1, n2, c, r;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Numero 1: \n");
	n1 = teclado.nextInt();
	System.out.print("Numero 2: \n");
	n2 = teclado.nextInt();
		
	c = n1 / n2;
	r = n1 % n2;
		
	System.out.println("");
	System.out.println("Cociente: " + c);
	System.out.println("Residuo: " + r);
    }    
}
