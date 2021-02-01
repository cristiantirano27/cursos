/*
 * 5. Hallar la radicacion de âˆša, donde a y n pertenecen a Z (numeros enteros positivos).
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema05 {
    public static void main(String[] args) {
	int a;
	short n, r;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("a: \n");
	a = teclado.nextInt();
	System.out.print("n: \n");
	n = teclado.nextShort();
		
	r = (short)Math.pow((double)a, (1/(double)n));
		
	System.out.println("");
	System.out.println("Potencia: " + r);
    }
}