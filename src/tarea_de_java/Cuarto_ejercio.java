package tarea_de_java;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Cuarto_ejercio {
    
     public static void main(String[] args) {
         Scanner pato = new Scanner(System.in);
         System.out.println("CUARTO EJERCICIO");
         
        String [] Pokemonnames = new String[5];
      
             for (int contador = 0; contador < Pokemonnames.length; contador++) {
              System.out.println("ingrese los nombres");
              Pokemonnames[contador] = pato.next();

         }
             
         int contador = 4;
                System.out.println("Los nombrese a la inversa son"); 
         while (contador >=0) {             
             
            
             System.out.println(Pokemonnames[contador]);
         
             contador--;
         }
         
         
    }
}
