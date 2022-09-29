package com.mycompany.asesoria;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Asesoria {

    public static void main(String[] args) {

        /*ENUMERADORES*/
        repasoArreglos();

    }

    public static void repasoArreglos() {
        int[][][] arr = new int[5][5][5];
        
       int contador = 0;
        for (int dim1 = 0; dim1 < arr.length; dim1++) {
            for (int dim2 = 0; dim2 < arr[dim1].length; dim2++) {
                for (int dim3 = 0; dim3 < arr[dim1][dim2].length; dim3++) {
                    System.out.println("["+dim1+"]"+"["+dim2+"]"+"["+dim3+"]");
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }

    public enum equipoFut {
        PUMAS(new String[]{"Jugador 1","Jugador 2"},"DT1"),
        AMERICA(new String[]{"Jugador 1","Jugador 2"},"DT2"),
        CHIVAS(new String[]{"Jugador 1","Jugador 2"},"DT3");
        
        private String[]jugadores;
        private String dt;     

        private equipoFut(String[] jugadores, String dt) {
            this.jugadores = jugadores;
            this.dt = dt;
        }

       

        public String[] getJugadores() {
            return jugadores;
        }

        public String getDt() {
            return dt;
        }
        
         

    }

    public enum Unit {
        METER(1, "m"), CENTIMETER(0.01, "cm"), MILIMETER(0.001, "mm");
        private double value;
        private String abreviado;

        private Unit(double value, String value2) {
            this.value = value;
            this.abreviado = value2;
        }

        public double getValue() {
            return value;
        }

        public String getAbreviado() {
            return abreviado;
        }

    }

    public static void repasoEnumeradores() {
        System.out.println("El equipo de chivas es: " );
    }

    public void repasoGenericos() {

    }

}
