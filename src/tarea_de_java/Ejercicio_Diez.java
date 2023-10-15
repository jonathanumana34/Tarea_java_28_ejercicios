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
public class Ejercicio_Diez {
       public static void main(String[] args){
           System.out.println("Ejercicio Diez");
           
           Scanner pato = new Scanner(System.in);
            int posicion=0,numero;
           int [] numeros = new int[10];
           System.out.println("Ingrese 5 numeros de forma creciente");
           for (int contador = 0; contador <= 4; contador++) {
            int contenedor = pato.nextInt();
               
              numeros[contador]= contenedor;

           }
           
           
          
           for (int contador = 0; contador < 5 ; contador++) {
               System.out.println("Ingrese el numero N de forma creciente");
           numero= pato.nextInt();
            
           System.out.println("Escriba el la posicion donde colocar el numero");
           posicion=pato.nextInt();  
           numeros[posicion]= numero;
           }
           for (int contador = 0; contador < 10; contador++) {            
          System.out.println(contador+"Los numeros son: "+ numeros[contador]);  

          
           }
       
       
       } 

}
