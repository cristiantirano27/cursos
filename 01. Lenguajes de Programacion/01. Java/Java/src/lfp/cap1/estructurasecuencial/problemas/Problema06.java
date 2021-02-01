/*
 * 
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema06 {
    public static void main(String[] args) {
	int n, ni, r;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Numero: \n");
	n = teclado.nextInt();
		
	r = n % 10;
	n = n / 10;
	ni = r * 10;
		
	r = n % 10;
	n = n / 10;
	ni = (ni  + r) * 10;
		
	r = n % 10;
	n = n / 10;
	ni = (ni + r) * 10;
		
	r = n % 10;
	n = n / 10;
	ni = (ni  + r) * 10;
		
	ni = ni + n;
		
	System.out.println("");
	System.out.println("Inverso: " + ni);
    }
}
