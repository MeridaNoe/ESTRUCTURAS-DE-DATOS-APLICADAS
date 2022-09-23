/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.suma_numeros_naturales;

import java.util.Scanner;

/**
 *
 * @author CC7
 */
public class Suma_numeros_naturales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
             leer.useDelimiter("\n");
             int num;
        System.out.println("ingresa  numero");
             num=leer.nextInt();
             Numeros n = new Numeros();
             System.out.println("resultado "+n.Calcula(num));
             
    }
}
