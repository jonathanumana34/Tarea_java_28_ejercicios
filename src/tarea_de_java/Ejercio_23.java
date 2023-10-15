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
public class Ejercio_23 {
    public static void main(String[] args){
        String nombre;
        System.out.println("Ejercicio numero 23");
        Scanner pato = new Scanner(System.in);
String[][] estadisticasPokemon = {
{"Pikachu", "90", "55", "40", "35"},
{"Charizard", "100", "84", "78", "78"},
{"Bulbasaur", "45", "49", "49", "45"},
{"Squirtle", "43", "48", "65", "44"},
{"Mewtwo", "130", "110", "90", "106"},
{"Gengar", "110", "65", "60", "60"},
{"Dragonite", "80", "134", "95", "91"},
{"Snorlax", "30", "110", "65", "160"},
{"Vaporeon", "65", "60", "95", "130"},
{"Machamp", "55", "130", "80", "90"},
{"Eevee", "55", "55", "50", "55"},
{"Alakazam", "120", "50", "45", "55"},
{"Lapras", "60", "85", "80", "130"},
{"Gyarados", "81", "125", "79", "95"},
{"Jigglypuff", "20", "45", "20", "115"}
};
      
 
            System.out.println("Ingrese el nombre del pokemon a que desea visualizar");  
            nombre= pato.next();
        
        
         for (int contador = 0; contador < 15; contador++) {
            for (int contador2 = 0; contador2 < 1; contador2++) {
                if (estadisticasPokemon[contador][contador2].equals(nombre)) {
                        System.out.println("El nombre del es"+ estadisticasPokemon[contador][contador2]+ 
               "\n velocidad: "+ estadisticasPokemon[contador][contador2+1]+
               "\n poder: "+ estadisticasPokemon[contador][contador2+2]+
               "\n resistencia: "+estadisticasPokemon[contador][contador2+3]+
               "\n hp: "+ estadisticasPokemon[contador][contador2+4]);
                    }
 
            }
     
              
        }
    

    }
}
