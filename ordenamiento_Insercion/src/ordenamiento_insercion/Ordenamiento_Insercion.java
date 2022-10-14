package ordenamiento_insercion;

public class Ordenamiento_Insercion {

    public static void main(String[] args) {
        int[] arr_Original = {50, 20, 40, 80, 30};
        int[] arr_Ordenado = new int[arr_Original.length];

        //colocoa el elemento 0 del array original en la posicion 0 del array ordenado.
        arr_Ordenado[0] = arr_Original[0];
        int pase = 1;
        // recorrer el resto de los elementos del array original

        for (int i = 1; i < arr_Original.length; i++) {
            int carta_tomada = arr_Original[i];//80
            for (int j = 0; j < pase/*3*/; j++) {
                if (carta_tomada < arr_Ordenado[j]) {
                    int aux = arr_Ordenado[j];
                    arr_Ordenado[j] = carta_tomada;
                    arr_Ordenado[j + 1] = aux;
                }
            }
            pase++;
        }
    }

}
