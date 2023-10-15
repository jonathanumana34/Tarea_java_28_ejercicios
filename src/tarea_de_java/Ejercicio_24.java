/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio_24 {
  public static void main(String[] args){
  
      int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
      
     // Convertir el array en un HashSet para eliminar los duplicados
        HashSet<Integer> numerosSinDuplicados = new HashSet<>();
        for (int numero : arrayOriginal) {
            numerosSinDuplicados.add(numero);
        }
        
        // Convertir el HashSet de nuevo a un array
        int[] numerosSinDuplicadosArray = new int[numerosSinDuplicados.size()];
        int index = 0;
        for (int numero : numerosSinDuplicados) {
            numerosSinDuplicadosArray[index++] = numero;
        }
        
        System.out.println("Array sin duplicados"+Arrays.toString(numerosSinDuplicadosArray));

  
  
  
  
  }  
}
