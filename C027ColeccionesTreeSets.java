
/*
    TreeSet

    - Garantiza que los elementos se almacenen en orden ascendente.
    - Es más lento que HashSet en operaciones de inserción, eliminación y búsqueda, pero mantiene el orden.
    - Utiliza el método compareTo() para determinar el orden de los elementos.
 */

import java.util.TreeSet;

public class C027ColeccionesTreeSets {
    public static void main(String[] args) {

        // Ejemplo del método add()
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("B");
        set1.add("A");
        set1.add("C");
        System.out.println(set1.toString()); // Imprime ["A", "B", "C"]

        // Ejemplo del método first()
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("B");
        set2.add("A");
        set2.add("C");
        String primerElemento = set2.first(); // Devuelve el primer elemento en el set
        System.out.println("El primer elemento es: " + primerElemento); // Imprime "El primer elemento es: A"

        // Ejemplo del método last()
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("B");
        set3.add("A");
        set3.add("C");
        String ultimoElemento = set3.last(); // Devuelve el último elemento en el set
        System.out.println("El último elemento es: " + ultimoElemento); // Imprime "El último elemento es: C"

        // Ejemplo del método remove()
        TreeSet<String> set4 = new TreeSet<>();
        set4.add("B");
        set4.add("A");
        set4.add("C");
        set4.remove("A"); // Elimina el elemento "A" del set
        System.out.println(set4.toString()); // Imprime ["B", "C"]

        // Ejemplo del método size()
        TreeSet<String> set5 = new TreeSet<>();
        set5.add("B");
        set5.add("A");
        set5.add("C");
        int tamano = set5.size(); // Devuelve la cantidad de elementos en el set
        System.out.println("El set tiene " + tamano + " elementos.");

        // Ejemplo del método clear()
        TreeSet<String> set6 = new TreeSet<>();
        set6.add("B");
        set6.add("A");
        set6.add("C");
        set6.clear(); // Elimina todos los elementos del set
        System.out.println(set6.toString()); // Imprime []

        // Ejemplo del método isEmpty()
        TreeSet<String> set7 = new TreeSet<>();
        boolean vacio = set7.isEmpty(); // Devuelve true si el set está vacío
        System.out.println("¿Está vacío? " + vacio); // Imprime "¿Está vacío? true"

        // Ejemplo del método toArray()
        TreeSet<String> set8 = new TreeSet<>();
        set8.add("B");
        set8.add("A");
        set8.add("C");
        Object[] arreglo = set8.toArray(); // Convierte el set a un arreglo
        for (Object elemento : arreglo) {
            System.out.println(elemento.toString());
        }
    }
}

