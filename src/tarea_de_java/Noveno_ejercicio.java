/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;
/**
 *
 * @author MINEDUCYT
 */
public class Noveno_ejercicio {
    
   public static void main(String[] args){ 
       System.out.println("Ejercicio Nueve");
      Scanner gallina = new Scanner(System.in);
      
     int [] numeros = new int [10];
     
       System.out.println("Ingrese los numeros");
       for (int contador = 0; contador < 10; contador++) {
           numeros[contador]= gallina.nextInt();

       }
       
       
       int finalj = numeros[9];
     
       for (int contador = 8; contador >=0; contador--) {
           numeros[contador+1] =numeros[contador];

       }
                numeros[0] = finalj;

 
       for (int contador = 0; contador < 10; contador++) {
           System.out.println(numeros[contador]);
       }
       
           
           
           
           
           
           
           
           
           
           
           } 
    
    
    
    
    
}
