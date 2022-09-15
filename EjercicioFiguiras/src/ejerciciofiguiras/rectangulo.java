
package ejerciciofiguiras;

public class rectangulo extends Figura{
    
    @Override
    public void llenar() {
        System.out.println("Ingresa el valor de la base del rectangulo");
        this.setBaseA(this.teclado.nextFloat());
        System.out.println("Ingresa el valor de la altura del rectangulo");
        this.setAltura(this.teclado.nextFloat());
    }

    @Override
    public void perimetro() {
        this.setPerimetro(2*(this.getBaseA()+this.getAltura()));
    }

    @Override
    public void area() {
        this.setArea(this.getBaseA()*this.getAltura());
    }
}
