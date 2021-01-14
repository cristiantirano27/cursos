/*
 * 1. Dados dos numeros enteros, hallar la suma.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema01 {
    public static void main(String[] args) {
	int n1, n2, s;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Numero 1: \n");
	n1 = teclado.nextInt();
	System.out.print("Numero 2: \n");
	n2 = teclado.nextInt();
		
	s = n1 + n2;
		
	System.out.println("");
	System.out.println("Suma: " + s);
    }
}
