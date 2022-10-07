package p01_arreglos2;

import java.util.Random;

public class P01_Arreglos2 {

    public static void main(String[] args) {
      
        int numeros[] = new int[10];
       
        int aleatorio = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            aleatorio = (int) (Math.random() * 100) + 1;
            numeros[i] = aleatorio;
            System.out.println(numeros[i]);
        }
        System.out.println("---------------------------"); 
       System.out.println("Numeros mayores a 50");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 50) {
                System.out.println("[" + numeros[i] + "]");
            }
        }
    }
}
