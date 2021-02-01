/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema08 {
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
