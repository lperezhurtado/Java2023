import java.util.Arrays;

public class C0033Arrays02 {
    public static void main(String[] args) {

    //Buscar un elemento determinado en un array


      /*
      En Java podemos buscar un elemento específico en un array utilizando el método Arrays.binarySearch()
      si el array está ordenado, o el método Arrays.asList().indexOf() si no está ordenado.
      */

        // Buscar un elemento en un array ordenado:

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elemento = 7;

        int indice = Arrays.binarySearch(array, elemento);

        if (indice >= 0) {
            System.out.println("El elemento " + elemento + " está en el índice " + indice + " del array.");
        } else {
            System.out.println("El elemento " + elemento + " no está en el array.");
        }


        /*
        Este programa busca el elemento 7 en el array de nombre "array".
        Como el array está ordenado, se utiliza el método Arrays.binarySearch(array, elemento)
        para buscar el elemento. Si el elemento se encuentra en el array, el método devuelve su índice.
        Si no se encuentra, el método devuelve un número negativo.
        En este caso, se utiliza una estructura if para imprimir un mensaje en pantalla
        informando si el elemento se encuentra o no en el array.
         */


        //Búsqueda en array no ordenado
        int[] array2 = {3, 6, 9, 2, 5, 8, 1, 4, 7};
        int elemento2 = 5;

        int indice2 = Arrays.asList(array2).indexOf(elemento2);

        if (indice2 >= 0) {
            System.out.println("El elemento " + elemento2 + " está en el índice " + indice2 + " del array.");
        } else {
            System.out.println("El elemento " + elemento2 + " no está en el array.");
        }
    }
}

