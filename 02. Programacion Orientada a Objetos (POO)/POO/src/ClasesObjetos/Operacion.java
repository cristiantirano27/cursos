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
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
        
    //Metodo para sumar los 2 numeros
    public void sumar(int num1, int num2){
        suma = num1 + num2;
    }
    
    //Metodo para restar los 2 numeros
    public void restar(int num1, int num2){
        resta = num1 - num2;
    }
    
    //Metodo para multiplicar los 2 numeros
    public void multiplicar(int num1, int num2){
        multiplicacion = num1 * num2;
    }
    
    //Metodo para dividir los 2 numeros
    public void dividir(int num1, int num2){
        division = num1 / num2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }

    
}
