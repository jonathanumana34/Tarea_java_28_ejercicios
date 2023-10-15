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
public class Ejercicio_22 {
  public static void main(String[] args){
      System.out.println("Ejercicio 22");
  int Matriz[][]=new int[8][6];
  int Largo=1,centro=0;
  
      for (int contador = 0; contador < 8; contador++) {
         
          for (int contador2 = 0; contador2 < 6; contador2++) {
        Matriz[contador][contador2]=centro;
              Matriz[Matriz.length-8][contador2]= Largo;
              Matriz[Matriz.length-1][contador2]= Largo;
              Matriz[contador][Matriz.length-8]=Largo;
              Matriz[contador][Matriz.length-3]=Largo;

              
              System.out.print(Matriz[contador][contador2]+" ");
              
          }
          System.out.println(" ");
      }
      
      
      
      
      
  }  
}
