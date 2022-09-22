package com.mycompany.ejemplo_recursividad_potencia;

public class Ejemplo_Recursividad_Potencia {

    public static void main(String[] args) {
        Potencia(4, 5);
    }
    public static int Potencia(int n, int exp) {
        System.out.println("el valor de n es: "+ exp);
        int resultado;
        if(exp==1){
            return 1;
        }
        resultado = Potencia(n, exp-1)*n;
        System.out.println("el resultado es: " + resultado);
        return resultado;
    }
}
