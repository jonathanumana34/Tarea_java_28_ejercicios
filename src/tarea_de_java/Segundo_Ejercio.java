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
public class Segundo_Ejercio {
    
     public static void main(String[] args) {
     int Elementos;
    
     Scanner polo = new Scanner(System.in);
     System.out.println(" Ingrese el numero de elementos");
     Elementos= polo.nextInt();
     
   int []numeros = new int[Elementos];
    
        for (int pato = 0; pato < Elementos; pato++) {
              System.out.println((pato)+" Digite los numeros");
              numeros[pato] = polo.nextInt();
        }
        
        for (int pato = 0; pato < Elementos; pato++) { 
            if (numeros[pato]>0) {
        System.out.println("El numero es positivo:"+ numeros[pato]);
        }else if(numeros[pato]<0){
            System.out.println(" El numero es negativo"+ numeros[pato]);
        }
                
            }
     }
}
