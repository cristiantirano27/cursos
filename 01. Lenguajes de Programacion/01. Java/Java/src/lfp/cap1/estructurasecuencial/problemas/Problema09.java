/*
 * 9. Crear un programa para encontrar el area de un circulo, use la formula:
 * A = π.r2
 * Area (A): Es el area del circulo.
 * PI (π): Representa el valor constante pi (3.14159)
 * Radio (r): Es el radio del circulo.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema09 {
    public static void main(String [] args){
        final float PI = 3.14159F;
        
        float a, r;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Radio: \n");
        r = teclado.nextFloat();
        
        a = (float) (PI * (Math.pow((double)r, 2.0)));
        
        System.out.println("");
        System.out.println("Area: " + a);
    }
}
