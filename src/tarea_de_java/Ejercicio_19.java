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
public class Ejercicio_19 {
  public static void main(String[] args){
  
   System.out.println("Ejercicio 19");
   Scanner pato = new Scanner(System.in);
   int temporal=0;
   int matriz[][]= new int [4][4];
   int filas=0,columnas=0;
   boolean Simetrico=true;

   
       for (int contador = 0; contador < 4; contador++) {
           for (int contador2 = 0; contador2 < 4; contador2++) {
               
               System.out.println("Matriz ["+contador+"]{"+contador2+"}");
               matriz[contador ][contador2]=pato.nextInt();
               
           }
           
       }
       System.out.println("La matriz antes de transponerla");
       for (int contador = 0; contador < 4; contador++) {
           for (int contador2 = 0; contador2 < 4; contador2++) {
               System.out.print(+matriz[contador][contador2]+" ");
           }
           System.out.println(" ");
       }
   

       
       for (int contador = 0; contador < 4; contador++) {
           for (int contador2 = 0; contador2 < 4; contador2++) {
               
                 filas =  contador;
                 columnas= contador2;
       }        
           }
       int numerador=0,numerador2=0;
        if (matriz[filas]== matriz[columnas]) {
           while(numerador<filas && Simetrico == true){
               while (numerador2<numerador && Simetrico== true) {                   
                   if (matriz[filas][columnas]  != matriz[columnas][filas]) {
                       Simetrico= false;
                   }
                   numerador2++;
               }
               numerador++;
           }
          
            if (Simetrico= true) {
                System.out.println("La matriz es simetrica");
            }else{
                System.out.println("La matriz no es simetrica");
            }
           
      }
       
       for (int contador = 0; contador < 4; contador++) {
           for (int contador2 = 0; contador2 < 4; contador2++) {
               System.out.println(matriz[contador][contador2]+" ");
           }
           System.out.println(" ");
      }
        
       
 
  }   
}
