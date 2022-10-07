package p01_arreglos3;

import java.util.Scanner;

public class P01_Arreglos3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Igresa el valor para [" + i + "]");
            array[i] = s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("número " + array[i] + " en la posición " + i);
        }*/
       int matriz[] = new int[10];
                    int mayor = 0,
                     menor = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.print("Ingresa un número: ");
                        matriz[i] = s.nextInt();
                        if (matriz[i] > mayor) {
                            mayor = matriz[i];
                        }
                    }
                    System.out.println("La suma del array es: " + sumar(matriz, 0));
                    System.out.println("El mayor es: " + mayor);
    }
    
    public static int sumar(int matriz[], int posicion) {
        int resultado = 0;
        if (posicion < matriz.length) {
            resultado = matriz[posicion] + sumar(matriz, posicion + 1);
        }
        return resultado;
    }
}
