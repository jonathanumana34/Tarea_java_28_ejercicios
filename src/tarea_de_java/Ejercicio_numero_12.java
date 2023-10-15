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
public class Ejercicio_numero_12 {
    public static void main(String[] args){
        String nombre;
        System.out.println("Ejercicio numero 12");
        Scanner pato = new Scanner(System.in);

      String[] nombresPokemonB = {
"Venusaur",
"Blastoise",
"Dragonite",
"Gyarados",
"Alakazam",
"Arcanine",
"Lapras",
"Golem",
"Gyarados",
"Rhydon"
};
        for (int contador = 0; contador < nombresPokemonB.length; contador++) {
            System.out.println(nombresPokemonB[contador]);
        }
          System.out.println("Ingrese el nombre del pokemon a buscar");
           nombre = pato.next();
          for (int contador = 0; contador < nombresPokemonB.length; contador++) {
           if (nombresPokemonB[contador].equals(nombre)) {                 
            System.out.println("El nombre del pokemon es: "+nombre+ " y la posicion es:"+contador);
            }
              
              
              
        }
    

    }
}
