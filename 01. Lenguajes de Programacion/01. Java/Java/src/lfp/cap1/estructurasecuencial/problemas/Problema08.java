/*
 * 8. Calcular el interes compuesto generado por un capital depositado durante cierta cantidad de tiempo a una tasa de interes 
 * determinada, aplique las siguientes formulas:
 * M = (1 + r%)*.C
 * I = M - C
 * Monto (M): Es la suma del capital mas sus intereses producido en determinado tiempo.
 * Tasa de Interes (r%): Es la ganancia que se obtiene por cada 100 unidades monetarias en cada periodo de tiempo.
 * Capital (C): Es todo aquello que se va a ceder o imponer durante algun tiempo para generar una ganancia.
 * Interes (I): Parte de la utilidad que obtiene el capital  prestar su dinero.
 * Tiempo (t): Es el periodo de tiempo durante el cual se cede el capital. 
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema08 {
    public static void main(String[] args) {
	float c, r, t, i, m;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Capital: \n");
	c = teclado.nextFloat();	
	System.out.print("Tasa de interes: \n");
	r = teclado.nextFloat();
	System.out.print("Tiempo: \n");
	t = teclado.nextFloat();
		
	m = (float)(Math.pow((double) (1 + r / 100), (double)t)) * c;
	i = m - c;
		
	System.out.println("");
	System.out.println("Interes: " + i);
	System.out.println("Monto: " + m);
    }
}
