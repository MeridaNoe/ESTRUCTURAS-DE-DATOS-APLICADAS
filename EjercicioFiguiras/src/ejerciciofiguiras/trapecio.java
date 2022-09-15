/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciofiguiras;

/**
 *
 * @author nmeri
 */
public class trapecio extends Figura{
    
    @Override
    public void llenar() {
        System.out.println("Ingresa el valor de uno de los lados");
        this.setLado(this.teclado.nextFloat());
    }

    @Override
    public void perimetro() {
        this.setPerimetro(this.getLado()*4);
    }

    @Override
    public void area() {
        this.setArea(this.getLado()*this.getLado());
    }
}
