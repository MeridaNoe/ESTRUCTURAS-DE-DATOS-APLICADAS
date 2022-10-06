package ejercicio_arrays;

import java.util.Scanner;

public class Ejercicio_arrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] num;
        int tam;
        int multiplicar = 1;
        System.out.println("¿Cuantas numeros va a guardar?");
        tam = s.nextInt();
        num = new int[tam];
        /*Recorrer el array*/
        for (int i = 0; i < tam; i++) {
            System.out.println("Igresa el valor para [" + i + "]");
            num[i] = s.nextInt();
            multiplicar = multiplicar * num[i];
        }
        System.out.println("el promedio de edades es: " + multiplicar);

    }

}
