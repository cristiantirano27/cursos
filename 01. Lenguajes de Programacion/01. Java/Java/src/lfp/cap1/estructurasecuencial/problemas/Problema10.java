/*
 * 10. Crear un programa que permita convertir una cantidad de segundos en horas, minutos y segundos.
 */
package lfp.cap1.estructurasecuencial.problemas;

import java.util.Scanner;

/**
 *
 * @author cristian tirano
 */
public class Problema10 {
    public static void main(String [] args){
        final int HORA = 3600;
        final int MINUTO = 60;
        
        int t, h, m, s;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Tiempo en segundos: \n");
        t = teclado.nextInt();
        
        h = t / HORA;
        t = t % HORA;
        m = t / MINUTO;
        s = t % MINUTO;
        
        System.out.println("");
        System.out.println("Horas: " + h);
        System.out.println("Minutos: " + m);
        System.out.println("Segundos: " + s);
    }
}
