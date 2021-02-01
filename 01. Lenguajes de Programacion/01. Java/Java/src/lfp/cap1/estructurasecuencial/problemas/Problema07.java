/*
 * 7. Determinar la suma de los N primeros numeros entre positivos (Z*) use la siguiente formula.
 *      N(N+1)
 * S = ----------
 *        2
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema07 {
    public static void main(String[] args) {
	int n, s;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Numero: ");
	n = teclado.nextInt();
		
	s = (n *(n + 1)) / 2;
		
	System.out.println("");
	System.out.println("Suma: " + s);
    }
}
