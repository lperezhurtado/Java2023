
/*
        LinkedHashSet

    - Es una implementación de conjunto basada en una tabla hash y una lista enlazada.
    - Garantiza que los elementos se almacenen en orden de inserción.
    - Es más rápido que TreeSet en operaciones de inserción, eliminación y búsqueda, y mantiene el orden.
    - Utiliza el método hashCode() y equals() para determinar si dos objetos son iguales.

 */

import java.util.HashSet;

public class C026ColeccionesLinkedHashSets {
    public static void main(String[] args) {


// Ejemplo del método add()
        HashSet<String> set1 = new HashSet<>();
        set1.add("Hola");
        set1.add("mundo");
        set1.add("Hola"); // Intenta agregar un elemento duplicado
        System.out.println(set1.toString()); // Imprime ["Hola", "mundo"]

        // Ejemplo del método contains()
        HashSet<String> set2 = new HashSet<>();
        set2.add("Hola");
        set2.add("mundo");
        boolean contieneHola = set2.contains("Hola"); // Devuelve true si el set contiene "Hola"
        System.out.println("¿Contiene \"Hola\"? " + contieneHola); // Imprime "¿Contiene "Hola"? true"

        // Ejemplo del método remove()
        HashSet<String> set3 = new HashSet<>();
        set3.add("Hola");
        set3.add("mundo");
        set3.remove("Hola"); // Elimina el elemento "Hola" del set
        System.out.println(set3.toString()); // Imprime ["mundo"]

        // Ejemplo del método size()
        HashSet<String> set4 = new HashSet<>();
        set4.add("Hola");
        set4.add("mundo");
        int tamano = set4.size(); // Devuelve la cantidad de elementos en el set
        System.out.println("El set tiene " + tamano + " elementos.");

        // Ejemplo del método clear()
        HashSet<String> set5 = new HashSet<>();
        set5.add("Hola");
        set5.add("mundo");
        set5.clear(); // Elimina todos los elementos del set
        System.out.println(set5.toString()); // Imprime []

        // Ejemplo del método isEmpty()
        HashSet<String> set6 = new HashSet<>();
        boolean vacio = set6.isEmpty(); // Devuelve true si el set está vacío
        System.out.println("¿Está vacío? " + vacio); // Imprime "¿Está vacío? true"

        // Ejemplo del método toArray()
        HashSet<String> set7 = new HashSet<>();
        set7.add("Hola");
        set7.add("mundo");
        Object[] arreglo = set7.toArray(); // Convierte el set a un arreglo
        for (Object elemento : arreglo) {
            System.out.println(elemento.toString());
        }
    }
}

