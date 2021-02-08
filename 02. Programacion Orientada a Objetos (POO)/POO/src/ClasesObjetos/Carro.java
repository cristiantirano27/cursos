/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesObjetos;

/**
 *
 * @author cristian tirano
 */
public class Carro {
    //Atributos
    public String color;
    public String marca;
    public String placa;
    public int km;
    
    //Metodods
    public static void main(String [] args){
        Carro carro1 = new Carro();
        carro1.color = "Azul";
        carro1.marca = "Renault";
        carro1.placa = "ABC-123";
        carro1.km = 0;
        System.out.println("Color del carro1: " + carro1.color);
        System.out.println("Marca del carro1: " + carro1.marca);
        System.out.println("Placa del carro1: " + carro1.placa);
        System.out.println("Kilometraje del carro1: " + carro1.km);
        
        Carro carro2 = new Carro();
        carro2.color = "Negro";
        carro2.marca = "Hyundai";
        carro2.placa = "XYZ-789";
        carro2.km = 0;
        System.out.println("\nColor del carro2: " + carro2.color);
        System.out.println("Marca del carro2: " + carro2.marca);
        System.out.println("Placa del carro2: " + carro2.placa);
        System.out.println("Kilometraje del carro2: " + carro2.km);
    }
}
