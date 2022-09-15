package ejerciciofiguiras;


public class cuadrado extends Figura {

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
