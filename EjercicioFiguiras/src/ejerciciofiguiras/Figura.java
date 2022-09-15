package ejerciciofiguiras;

import java.util.Scanner;

public abstract class Figura {

    private float lado;
    private float perimetro;
    private float area;
    private float diametro;
    private float radio;
    private double pi=3.1416;
    private float baseA;
    private float baseB;
    private float largo;
    private float ancho;
    private float altura;
    private float diagMayor;
    private float diagMenor;
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;
    Scanner teclado = new Scanner(System.in);

    public Figura() {
    }

    @Override
    public String toString() {
        return "Figura{" + "lado=" + lado + '}';
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getDiametro() {
        return diametro;
    }

    /*circulo*/
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    
    

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBaseA() {
        return baseA;
    }

    public void setBaseA(float baseA) {
        this.baseA = baseA;
    }

    public float getBaseB() {
        return baseB;
    }

    public void setBaseB(float baseB) {
        this.baseB = baseB;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public float getLado4() {
        return lado4;
    }

    public void setLado4(float lado4) {
        this.lado4 = lado4;
    }

    public float getDiagMayor() {
        return diagMayor;
    }

    public void setDiagMayor(float diagMayor) {
        this.diagMayor = diagMayor;
    }

    public float getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(float diagMenor) {
        this.diagMenor = diagMenor;
    }

    
    
    
    /*
    Metodos abstractos
     */
    public abstract void llenar();

    public abstract void perimetro();

    public abstract void area();
}
