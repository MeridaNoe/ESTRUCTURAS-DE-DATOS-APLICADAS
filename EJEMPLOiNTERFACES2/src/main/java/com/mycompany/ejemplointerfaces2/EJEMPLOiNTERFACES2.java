package com.mycompany.ejemplointerfaces2;

import java.util.Scanner;

public class EJEMPLOiNTERFACES2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opc = 0;
        Producto p = null;
        do {
            System.out.println("seleccione una opcion");
            System.out.println("1.- Altas");
            System.out.println("2.- bajas");
            opc = s.nextInt();
            switch (opc) {
                case 1:
                    p= new Producto();
                    p.altas();
                    break;
                case 2:
                    p.bajas();
                    break;
                case 3:
                    p.modificaciones();
                    break;
                case 4:
                    p.consulta();
                    break;
                default:
                   System.err.println("opcion no valida");
            }
            System.out.println();
        } while (opc != 0);
        
    }
}
