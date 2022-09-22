/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author gomez
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] matriz = new int[100];
        
        int subfuncion = 0;
        while(subfuncion<100){
            matriz[subfuncion]= subfuncion + 1;
            subfuncion++;
        } 
        System.out.println("Contenido de matriz");
        for (int i = 0; i < 100; i++) {
            System.out.println(matriz[i]);
       }
        
        
    }
    
}
