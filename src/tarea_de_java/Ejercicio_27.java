/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio_27 {
    static ArrayList<Integer> posicionesjuagador = new ArrayList<>();
    static ArrayList<Integer> posicionescomputadora = new ArrayList<>();
    public static void main(String[] args) {
        char tablero[][] = {{' ','|', ' ','|',' '},
                            {'-','+', '-','+','-'},
                            {' ','|', ' ','|',' '},
                            {'-','+', '-','+','-'},
                            {' ','|', ' ','|',' '}};
        
        Mostrarpantalla(tablero);
        Scanner patos = new Scanner(System.in); 
        Random poyo = new Random();
       
        while (true) {            
                   System.out.println("Ingrese la posicion donde desea mover la x de 0-9");
       int posicion = patos.nextInt();
            while (posicionesjuagador.contains(posicion)|| posicionescomputadora.contains(posicionescomputadora)) {                
                System.out.println("Pposicion ocupada por favor ingrese otra posicion");
                posicion = patos.nextInt();
            }
        Moverpieza(tablero, posicion, "Jugador");
         String resultados = Ganadores();
          if (resultados.length()>0) {
              System.out.println(resultados);
                 break;
            }
         Mostrarpantalla(tablero);
          int poscioncpu = poyo.nextInt(9)+1;
          while (posicionesjuagador.contains(poscioncpu)|| posicionescomputadora.contains(poscioncpu)) {                
                poscioncpu = poyo.nextInt(9)+1;
            }
        Moverpieza(tablero, poscioncpu, "computadora"); 
        resultados = Ganadores();
            if (resultados.length()>0) {
              System.out.println(resultados);
                 break;
            }
           
        }
      

    }
        
   public static void Mostrarpantalla( char [][] tablero){
 for (char[] pato : tablero ) {
            System.out.println(pato);
        }
}    
   
    public static void Moverpieza(char [][] tablero,int posicion, String user) {
        char simbolos = ' ';
        if (user.equals( "Jugador")) {
            simbolos='x';
            posicionesjuagador.add(posicion);
        }else if(user.equals("computadora")){
            posicionescomputadora.add(posicion);
        simbolos = 'O';
        }
        switch (posicion) {
            case 1:
                tablero[0][0]= simbolos;
                break;
                case 2:
                tablero[0][2]= simbolos;
                break;
                case 3:
                tablero[0][4]= simbolos;
                break;
                case 4:
                tablero[2][0]= simbolos;
                break;
                case 5:
                tablero[2][2]= simbolos;
                break;
                case 6:
                tablero[2][4]= simbolos;
                break;
                case 7:
                tablero[4][0]= simbolos;
                break;
                case 8:
                tablero[4][2]= simbolos;
                break;
                case 9:
                tablero[4][4]= simbolos;
                break;
            default:
                break;
            
        }
                
    }
    public static String Ganadores() {
        List Filasuperior = Arrays.asList(1,2,3);
        List Filadelmedio = Arrays.asList(4,5,6);
        List Filainferiro = Arrays.asList(7,8,9);
        List columnaIzquierda = Arrays.asList(1,4,7);
        List columnadelmedio = Arrays.asList(2,5,8);
        List columnaderecha = Arrays.asList(3,6,9);
        List Cruz1 = Arrays.asList(1,5,9);
        List Cruz2 = Arrays.asList(7,5,3);

        
        
        
        List<List>condiciones = new ArrayList<List>();
        
        condiciones.add(Filasuperior);
        condiciones.add(Filadelmedio);
        condiciones.add(Filainferiro);
        condiciones.add(columnaIzquierda);
        condiciones.add(columnadelmedio);
        condiciones.add(columnaderecha);
        condiciones.add(Cruz1);
        condiciones.add(Cruz2);

                
        for (List condicion : condiciones) {
            
            if (posicionesjuagador.containsAll(condicion)) {
               return "Felicidades has ganado";
            }else  if (posicionescomputadora.containsAll(condicion)) {
               return "La computadora ha ganado :(";
            }else if ( posicionesjuagador.size()+posicionescomputadora.size()==9) {
                return "Empate mejor suerte para la proxima";
            }
        }
        
        
        
        return "";
    }
}
