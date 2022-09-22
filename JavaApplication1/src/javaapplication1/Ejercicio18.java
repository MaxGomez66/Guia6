/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int [4][4]; //digo que es una matriz de 4*4
        
          // pido que se escriba la matriz
        //bucle para que se escriba la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int) (Math.random()* 9 + 1);
                System.out.print("Matriz["+i+"] ["+j+"]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //mostrar matriz original
        System.out.println("/nMatrizoriginal");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]+" ");

            }
            System.out.println("");
            
            
            
        }
       //transporte la matriz
       int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i] = aux;
            }     
                }
        
        //escribiendo la matriz
         System.out.println("/nLa Matriz transpuesta es");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
            }
        }
            //salto de linea
 System.out.println("");
    }
    
}
