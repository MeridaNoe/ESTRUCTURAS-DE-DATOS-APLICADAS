package ejerciciofiguiras;

import java.util.Scanner;

public class EjercicioFiguiras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcF;
        Figura figura = null;
        System.out.println("Selecciona una opçion");
        System.out.println("1. Cuadradado");
        System.out.println("2. Triangulo");
        System.out.println("3. Rectángulo");
        System.out.println("4. Circulo");
        System.out.println("5. Rombo");
        System.out.println("6. Trapecio");
        opcF = teclado.nextInt();
        switch (opcF) {
            case 1:
                figura = new cuadrado();
                break;
            case 2:
                figura = new triangulo();
                break;
            case 3:
                figura = new rectangulo();
                break;
            case 4:
                figura = new circulo();
                break;
            case 5:
                figura = new rombo();
                break;
            case 6:
                figura = new trapecio();
                break;
            default:
                System.err.println("Opcion Invalida");
        }
        figura.llenar();
        figura.area();
        figura.perimetro();
        System.out.println("El perimetro de la figura es: " + figura.getPerimetro());
        System.out.println("El area de la figura es: " + figura.getArea());
        
    }

}
