package ejerciciofiguiras;


public class circulo extends Figura{

    
    
    @Override
    public void llenar() {
         
    System.out.println("Ingresa el valor del diametro del circulo");
        this.setDiametro(this.teclado.nextFloat());
        System.out.println("Ingresa el valor del radio del circulo");
        this.setRadio(this.teclado.nextFloat());
    }

    @Override
    public void perimetro() {
        this.setPerimetro((float) (this.getPi()*this.getDiametro()));
    }

    @Override
    public void area() {
        this.setArea(this.getPi()*(this.getRadio())^2);
    }

    
}
