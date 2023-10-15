
package tarea_de_java;
import java.util.Scanner;
public class quinto_ejercicio {
   public static void main(String[] args) {
        
      int Elementos,mayor,menor;
       System.out.println("QUINTO EJERCICIO");
     Scanner polo = new Scanner(System.in);
     System.out.println(" Ingrese el numero de elementos");
     Elementos= polo.nextInt();
     
   int []numeros = new int[Elementos];
    
        for (int pato = 0; pato < numeros.length; pato++) {
              System.out.println((pato)+" Digite los numeros");
              numeros[pato] = polo.nextInt();
        }     
        
        mayor=menor=numeros[0];
        
        for (int pato = 0; pato < numeros.length; pato++) { 
            if (numeros[pato]>mayor) {
                mayor = numeros[pato];
        }else if(numeros[pato]<menor){
            menor= numeros[pato];
        }
                
            }
                System.out.println("El numero es mayor:"+ mayor);
                 System.out.println(" El numero es menor: "+ menor);

    }
    
}
