package tarea_de_java;
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args){
        int contador,numero;
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
        System.out.println(" Ingrese un numero que este dentro el rango de 0-9");
        numero = pato.nextInt();
        for ( contador = 0; contador < nombresPokemonB.length; contador++) {
            if (numero==contador) {
                System.out.println("El numero se encuentra dentro del rango de 0-9");
                System.out.println(nombresPokemonB[contador]);
            }
        }
        
 if(numero> 10){System.out.println("Se ha salido del rango");}
        
        
        
        
        
        
        
        
        
    } 
}
