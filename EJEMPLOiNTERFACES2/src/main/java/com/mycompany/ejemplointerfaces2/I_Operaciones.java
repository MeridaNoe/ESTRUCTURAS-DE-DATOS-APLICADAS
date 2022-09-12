package com.mycompany.ejemplointerfaces2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public interface I_Operaciones {

    Scanner teclado = new Scanner(System.in);
    
    Date f_operacion = new Date();
    ArrayList<Object> lista_Objetos = new ArrayList();
    
    public void altas();

    public void bajas();

    public void modificaciones();

    public void consulta();
    
    public void imprimir();
    
    
    
}
