/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author MINEDUCYT
 */
public class Octavo_Ejercicio {
public static void main(String[] args) {
Scanner gallo = new Scanner(System.in);
int aux=0,numero=0;
int posicion=0;
    System.out.println("Octavo Ejercicio");
int[] numeros = new int [10];

        System.out.println("Ingrese los numeros");
    for (int contador = 0; contador < 8; contador++) {
        numeros[contador] = gallo.nextInt();
    }

    for (int contador = 7; contador >= posicion; contador--) {
        numeros[contador+1]=numeros[contador];
    }
    
   
        System.out.println("Ingrese el numero ");
        numero=gallo.nextInt();
    
        System.out.println("Ingrese la posicion ");
        posicion=gallo.nextInt();
  
numeros[posicion]=numero;


            System.out.println("Resltados");  

        for (int contador = 0; contador < numeros.length; contador++) {
        
            System.out.println(numeros[contador]);
         
            
            
    }
       

    
}

}
