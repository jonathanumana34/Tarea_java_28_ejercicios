/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_de_java;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio_26 {
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 int totalVentas=0;
        System.out.print("Ingrese la cantidad de filas para el microbús (entre 6 y 10): ");
        int filas = scanner.nextInt();
        if (filas < 6 || filas > 10) {
            System.out.println("La cantidad de filas debe estar entre 6 y 10. Saliendo del programa...");
            return;}
        int[] asientosIzquierdo = new int[filas];
        int[] asientosDerecho = new int[filas];
        Arrays.fill(asientosIzquierdo, -1);
        Arrays.fill(asientosDerecho, -1);
       
        int opcion;
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Ver Distribución");
            System.out.println("2. Vender Asientos");
            System.out.println("3. Devolver Asientos");
            System.out.println("4. Mostrar la Caja");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();            
            switch (opcion) {
                case 1:
                    mostrarDistribucion(asientosIzquierdo, asientosDerecho);
                    break;
                case 2:
                    venderAsientos(asientosIzquierdo, asientosDerecho, scanner);
                    break;
                case 3:
                    devolverAsientos(asientosIzquierdo, asientosDerecho, scanner);
                    break;
                case 4:
                    mostrarCaja(totalVentas);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();}
    private static void mostrarDistribucion(int[] asientosIzquierdo, int[] asientosDerecho) {
        System.out.println("\n--- Distribución de Asientos ---");
        System.out.println("Lado Izquierdo: " + Arrays.toString(asientosIzquierdo));
        System.out.println("Lado Derecho: " + Arrays.toString(asientosDerecho));
    }
    private static void venderAsientos(int[] asientosIzquierdo, int[] asientosDerecho, Scanner scanner) {
        int totalVentas=0;
        System.out.print("Seleccione el lado (1 - Izquierdo, 2 - Derecho): ");
        int lado = scanner.nextInt();
        if (lado != 1 && lado != 2) {
            System.out.println("Lado inválido. Por favor, seleccione un lado válido.");
            return;
        }
        
        int[] asientos;
        if (lado == 1) {
            asientos = asientosIzquierdo;
        } else {
            asientos = asientosDerecho;
        }
        
        System.out.print("Ingrese la cantidad de asientos a vender (1 o 2): ");
        int cantidad = scanner.nextInt();
        
        if (cantidad != 1 && cantidad != 2) {
            System.out.println("Cantidad inválida. Por favor, ingrese una cantidad válida.");
            return;
        }
        System.out.println("Distribución de Asientos (Lado " + (lado == 1 ? "Izquierdo" : "Derecho") + "): " + Arrays.toString(asientos));
        System.out.print("Ingrese el número de asiento(s) a vender: ");
        int numeroAsiento = scanner.nextInt();
        
       
        if (numeroAsiento < 1 || numeroAsiento > asientos.length) {
            System.out.println("Número de asiento inválido. Por favor, ingrese un número de asiento válido.");
            return;
        }
        
       
        if (asientos[numeroAsiento - 1] == 1) {
            System.out.println("El asiento seleccionado ya está ocupado. No se puede vender.");
            return;
        }
        
    
        asientos[numeroAsiento - 1] = 1;
        
     
        totalVentas += cantidad;
        
        System.out.println("Asiento(s) vendido(s) con éxito.");
    }
    

    private static void devolverAsientos(int[] asientosIzquierdo, int[] asientosDerecho, Scanner scanner) {
        int totalVentas=0;
        System.out.print("Seleccione el lado (1 - Izquierdo, 2 - Derecho): ");
        int lado = scanner.nextInt();
        
    
        if (lado != 1 && lado != 2) {
            System.out.println("Lado inválido. Por favor, seleccione un lado válido.");
            return;
        }
        
        int[] asientos;
        if (lado == 1) {
            asientos = asientosIzquierdo;
        } else {
            asientos = asientosDerecho;
        }
        
     
        System.out.println("Distribución de Asientos (Lado " + (lado == 1 ? "Izquierdo" : "Derecho") + "): " + Arrays.toString(asientos));
        
     
        System.out.print("Ingrese el número de asiento a devolver: ");
        int numeroAsiento = scanner.nextInt();
        
  
        if (numeroAsiento < 1 || numeroAsiento > asientos.length) {
            System.out.println("Número de asiento inválido. Por favor, ingrese un número de asiento válido.");
            return;
        }
        
       
        if (asientos[numeroAsiento - 1] == -1) {
            System.out.println("El asiento seleccionado no está ocupado. No se puede devolver.");
            return;
        }
        

        asientos[numeroAsiento - 1] = -1;
        
     
        totalVentas--;
        
        System.out.println("Asiento devuelto con éxito.");
    }
    
 
    private static void mostrarCaja(int totalVentas) {
        System.out.println("\n--- Caja ---");
        System.out.println("Total de Ventas: " + totalVentas);

 
 
 
 
 }   
}
