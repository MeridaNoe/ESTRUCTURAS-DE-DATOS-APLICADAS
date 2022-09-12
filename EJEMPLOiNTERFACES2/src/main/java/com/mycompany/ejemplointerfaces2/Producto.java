package com.mycompany.ejemplointerfaces2;

import java.util.Iterator;

public class Producto implements I_Operaciones{

    
    String codigo;
    String Nombre;
    float precio;
    int existencias;
    String decripcion;

    public Producto() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    @Override
    public void altas() {
        System.out.println("Ingresa el codigo del producto");
        this.setCodigo(teclado.nextLine());
        System.out.println("Ingresa el nombre dle producto");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingresa la descripcion del producto");
        this.setDecripcion(teclado.nextLine());
        System.out.println("Ingrese el precio del producto");
        this.setPrecio(teclado.nextFloat());
        System.out.println("Ingresa las existencias del producto");
        this.setExistencias(teclado.nextInt());
        /*
        agregar al arraylist
        */
        lista_Objetos.add(this);
    }

    @Override
    public void bajas() {
        
    }

    @Override
    public void modificaciones() {
        
    }

    @Override
    public void consulta() {
        
    }

    @Override
    public void imprimir() {
        Iterator it = lista_Objetos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", precio=" + precio + ", existencias=" + existencias + ", decripcion=" + decripcion + '}';
    }
    
    
}
