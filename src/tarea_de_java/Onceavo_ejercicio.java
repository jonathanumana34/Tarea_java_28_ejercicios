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
public class Onceavo_ejercicio {
     public static void main(String[] args){
         System.out.println("Onceavo ejercicio");
     Scanner Pato = new Scanner(System.in);
     int posicion;
     int []numeros= new int [10];
     
         System.out.println("Ingrese los numeros");
         for (int contador = 0; contador < numeros.length; contador++) {
             numeros[contador]= Pato.nextInt();
             
             
             
             
         }
     
     
         System.out.println("INdice a eliminar");
         posicion = Pato.nextInt();
     
         for (int contador = posicion; contador < 9; contador++) {
             numeros[contador]= numeros[contador+1];
         }
     
     
         for (int contador = 0; contador < 9; contador++) {
             System.out.println(numeros[contador]);
         }
     
     
     
     }
}
