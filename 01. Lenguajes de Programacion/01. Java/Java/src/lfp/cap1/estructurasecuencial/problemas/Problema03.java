/*
 * 3. Dado el valor de venta de un producto, hallar el IGV (19%) y el precio de venta.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema03 {
    public static void main (String [] args){
        float vv, igv, pv;
		
	Scanner teclado = new Scanner(System.in);
	System.out.print("Valor de venta: \n");
	vv = teclado.nextFloat();
	
	igv = vv * 0.19F;
	pv = vv + igv;
		
	System.out.println("");
	System.out.println("IGV: " + igv);
	System.out.println("Precio de venta: " + pv);
    }
}
