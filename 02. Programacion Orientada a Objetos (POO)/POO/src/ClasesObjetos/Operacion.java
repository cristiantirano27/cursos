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
public class Operacion {
    //Atributos
    
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
    //Metodo para pedirle al usuario que digite 2 numeros
    public void leerNumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro  numero: "));
    }
    
    //Metodo para sumar los 2 numeros
    public void sumar(){
        suma = num1 + num2;
    }
    
    //Metodo para restar los 2 numeros
    public void restar(){
        resta = num1 - num2;
    }
    
    //Metodo para multiplicar los 2 numeros
    public void multiplicar(){
        multiplicacion = num1 * num2;
    }
    
    //Metodo para dividir los 2 numeros
    public void dividir(){
        division = num1 / num2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }

    
}
