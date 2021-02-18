/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author cristian tirano
 */
public class Main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        
        Operacion op = new Operacion();
        
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);
        
        System.out.println("La suma es: " + op.sumar(n1, n2));
        System.out.println("La rets es: " + op.restar(n1, n2));
        System.out.println("La multiplicacion es: " + op.multiplicar(n1, n2));
        System.out.println("La division es: " + op.dividir(n1, n2));
    }
}
