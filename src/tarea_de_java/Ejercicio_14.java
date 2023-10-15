/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_14 {
    public static void main(String[] args){
    
    int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98,
45};
    
    Arrays.sort(numerosDesordenados);
    
        System.out.println("Numeros ordenados de forma asccendente");
        for (int numero : numerosDesordenados) {
            System.out.println(numero);
        }
        System.out.println("Numeros ordenados de forma decresiente");
        for (int contador = numerosDesordenados.length-1; contador >= 0; contador--) {
            System.out.println(numerosDesordenados[contador]);
        }

    
        
    
    
    }
}
