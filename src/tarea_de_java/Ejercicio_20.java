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
public class Ejercicio_20 {
    public static void main(String[] args){
        System.out.println("Ejercicio 20");
    Scanner pato = new Scanner(System.in);
    int Matriz[][]=new int[3][3];
    int Matriz2[][]=new int[3][3];
    int Matrizreusltado[][]= new int [3][3];
         System.out.println("Ingrese los numeros en la primera matriz");  
        for (int contador = 0; contador < Matriz.length; contador++) {
            for (int contador2 = 0; contador2 < Matriz.length; contador2++) {
                Matriz[contador][contador2]=pato.nextInt();
            }}
         System.out.println("Ingrese los numeros de la segunda matriz matriz");  
         for (int contador = 0; contador < Matriz2.length; contador++) {
            for (int contador2 = 0; contador2 < Matriz2.length; contador2++) {
                Matriz2[contador][contador2]=pato.nextInt();
            }} 
        System.out.println("El resultado de la suma de matrices es:");
        for (int contador = 0; contador < 3; contador++) {
            for (int contador2 = 0; contador2 < 3; contador2++) {      
  Matrizreusltado[contador][contador2] = Matriz[contador][contador2]+Matriz2[contador][contador2];
            }}
        for (int contador = 0; contador < 3; contador++) {
            for (int contador2 = 0; contador2 < 3; contador2++) {
                System.out.println(Matrizreusltado[contador][contador2]);
            }
        }
    }
}
