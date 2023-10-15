/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;
/**
 *
 * @author MINEDUCYT
 */
public class Tarea_de_java {

    /**
     * @param args the command line arguments
     */
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
        System.out.println("Los numeros son :");
        
        for (int pato = 0; pato < Elementos; pato++) {
            System.out.println(numeros[pato]);
            
        }
   
      
       
    }
    
}
