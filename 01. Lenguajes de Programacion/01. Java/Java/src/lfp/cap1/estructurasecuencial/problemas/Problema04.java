/*
 * 4. Hallar la potencia de a(n), donde a y n pertenecen a Z (numeros enteros positivos).
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema04 {
    public static void main(String[] args) {
        short a, n;
	int p;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("a: \n");
	a = teclado.nextShort();
	System.out.print("n: \n");
	n = teclado.nextShort();
		
	p = (int)Math.pow((double)a, (double)n);
		
	System.out.println("");
	System.out.println("Potencia: " + p);
    }
}