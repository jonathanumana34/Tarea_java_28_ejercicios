/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;

public class Tercer_ejercicio_3_ {
   public static void main(String[] args) {
   Scanner pollo = new Scanner(System.in);
   
       System.out.println("Ingrese el numero de elementos");
       int pollonumeros = pollo.nextInt();
       
       int [] Numeros = new int[pollonumeros];
       
       for (int contador = 0; contador < Numeros.length; contador++) {
           System.out.println((contador)+" Digite los numeros");
           Numeros[contador] = pollo.nextInt();
           
       }
   /** El 2 es la tercera posicion el 4 es la quinta posicion  **/
       for (int contador = 0; contador < Numeros.length; contador++) {
           if (Numeros[2] > Numeros[4] ) {
           Numeros[4]=Numeros[2];
       } 
       }
   /** El Numeros.length-2 es la penultima posicion el 3 es la posicion numero 4**/
         for (int contador = 0; contador < Numeros.length; contador++) {
          if(Numeros[Numeros.length-2]>Numeros[3]) {
         Numeros[3] = Numeros[Numeros.length-2];
       };   
       }
       /** El 1 es la segunda posicion **/  
           for (int contador = 0; contador < Numeros.length; contador++) {
           if(Numeros[1]> Numeros[2]){
       Numeros[2]= Numeros[1];
       
       } 
       }
       /** El Numeros.length-1 es la ultima posicion y el 1 es la segunda posicion**/    
            for (int contador = 0; contador < Numeros.length; contador++) {
           if(Numeros[Numeros.length-1]> Numeros[1]){
       Numeros[1] = Numeros[Numeros.length-1];
       }   
       }
            
            
           System.out.println("Numeros cambiados");
       for (int contador = 0; contador < Numeros.length; contador++) {
           System.out.println("Los numeros son: "+ Numeros[contador]);
       }
   
   
   } 
         
         
     
}
