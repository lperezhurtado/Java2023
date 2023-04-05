import java.util.Arrays;
import java.util.List;

public class C0033MetodosArrays {
    public static void main(String[] args) {

        /*
        length: este método se utiliza para obtener la longitud de un array en Java.
        Devuelve un valor int que representa la cantidad de elementos en el array.
         */

        int[] miArray = {1, 2, 3, 4, 5};
        int longitud = miArray.length; // Devuelve 5

        /*
        clone: este método se utiliza para crear una copia exacta de un array en Java.
        Devuelve un nuevo array que es una copia del array original.
         */

        int[] miArray2 = {1, 2, 3, 4, 5};
        int[] miArrayCopia = miArray2.clone(); // Crea una copia del array original

        /*
        toString: este método se utiliza para obtener una representación de cadena de un array en Java.
        Devuelve una cadena que representa todos los elementos en el array
         */

        int[] miArray3 = {1, 2, 3, 4, 5};
        String miArrayString = Arrays.toString(miArray3); // Devuelve "[1, 2, 3, 4, 5]"

        /*
        sort: este método se utiliza para ordenar los elementos de un array en Java.
        Puede ordenar un array de tipos de datos primitivos o un array de objetos que
        implementan la interfaz Comparable.
         */

        int[] miArray4 = {5, 3, 1, 4, 2};
        Arrays.sort(miArray4); // Ordena el array en orden ascendente

        /*
        binarySearch: este método se utiliza para buscar un elemento en un array ordenado en Java.
        Devuelve el índice del elemento buscado en el array si se encuentra, de lo contrario,
        devuelve un valor negativo.
         */

        int[] miArray5 = {1, 2, 3, 4, 5};
        int indice = Arrays.binarySearch(miArray5, 3); // Devuelve 2, que es el índice del número 3 en el array

        /*
        fill: este método se utiliza para rellenar todos los elementos de un array con un
        valor específico
         */

        int[] miArray6 = new int[5];
        Arrays.fill(miArray6, 0); // Llena todos los elementos del array con el valor 0

        /*
        copyOf: este método se utiliza para crear una copia de un array con una longitud
        específica en Java. Si la longitud es mayor que la longitud del array original,
        los elementos adicionales se rellenarán con valores predeterminados para el tipo de datos.
         */

        int[] miArray7 = {1, 2, 3, 4, 5};
        int[] miArrayCopia2 = Arrays.copyOf(miArray7, 3); // Crea una copia del array original con longitud 3


        /*
            equals: este método se utiliza para comparar dos arrays en Java.
            Devuelve true si ambos arrays son iguales en términos de longitud y
            contenido, de lo contrario, devuelve false.
         */

        int[] miArray8 = {1, 2, 3, 4, 5};
        int[] miArray9 = {1, 2, 3, 4, 5};
        boolean sonIguales = Arrays.equals(miArray8, miArray9); // Devuelve true

        /*
        asList: este método se utiliza para convertir un array en una lista en Java.
        Devuelve una lista que contiene todos los elementos del array.
         */

        String[] miArray10 = {"hola", "mundo"};
        List<String> miLista = Arrays.asList(miArray10); // Convierte el array en una lista


        /*
        parallelSort: este método se utiliza para ordenar los elementos de un array
        en paralelo en Java. Es útil para ordenar grandes arrays en múltiples núcleos
        de CPU para mejorar el rendimiento
         */

        int[] miArray11 = {5, 3, 1, 4, 2};
        Arrays.parallelSort(miArray11); // Ordena el array en orden ascendente de manera paralela


    }
}

