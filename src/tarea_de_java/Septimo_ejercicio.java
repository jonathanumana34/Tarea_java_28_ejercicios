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
public class Septimo_ejercicio {
    
    public static void main(String[] args) {
        System.out.println("Septimo Ejercicio");
    Scanner Gallo =new Scanner(System.in);
        
    int [] numeros = new int[10];
    
    boolean Creciente = false;  boolean Decreciente = false;
    
    
    
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println("Ingrese los numeros");
            numeros[contador] = Gallo.nextInt();
        }
    
     for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println( numeros[contador]);
        }
     
    
    for( int contador =0; contador<9; contador++){
    
        if (numeros[contador]< numeros[contador+1]) {
        Creciente= true;   
        }   
        if (numeros[contador]>numeros[contador+1]) {
        Decreciente= true;
        }
         
        
        
         if (Creciente == true && Decreciente == false ) {
         System.out.println("Los numeros son crecientestes"+ numeros[contador]);
        } else if (Creciente == false && Decreciente==true){
         System.out.println("Los numeros son decrecientes"+numeros[contador+1]);
        }else if( Creciente==true && Decreciente==true){
             System.out.println(" Los numeros estan desordenados"+ numeros[contador]);
        }else if(Creciente == false && Decreciente == false){
         System.out.println("Todos los numeros son iguales"+numeros[contador]);
        }
        }
    
    } 
    
    
    
}
