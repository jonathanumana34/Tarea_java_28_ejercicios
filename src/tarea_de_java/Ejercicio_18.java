/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio_18 {
   public static void main(String[] args){
       System.out.println("Ejercicio 18");
   Scanner pato= new Scanner(System.in);
   int matriz[][]=new int[7][7];
   
     matriz[0][0]=matriz[1][1]=matriz[2][2]= matriz[3][3]=matriz[4][4]=matriz[5][5]=matriz[6][6]=1;
       for (int contador = 0; contador < matriz.length; contador++) {
           
           matriz[contador][contador]=1;
       }
   
   for (int contador = 0; contador < matriz.length; contador++) {        
        System.out.println(Arrays.toString(matriz[contador]));
       }
   
   } 
}
