
/*
    HashSet

    - Es una implementación de conjunto basada en una tabla hash.
    - No garantiza ningún orden en los elementos.
    - Es más rápido que TreeSet y LinkedHashSet en operaciones de inserción, eliminación y búsqueda,
      pero no mantiene el orden.
    - Utiliza el método hashCode() y equals() para determinar si dos objetos son iguales.
 */


import java.util.HashSet;
import java.util.Set;

public class C025ColeccionesHashSet {
    public static void main(String[] args) {

        /*
        add(elemento): Agrega el elemento especificado al conjunto si no está presente.
        Retorna true si el elemento se agregó exitosamente, false si ya estaba presente.
         */

        Set<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        boolean resultado = nombres.add("María");
        System.out.println(resultado); // Imprime true, porque "María" se agregó correctamente.

        /*
        remove(elemento): Elimina el elemento especificado del conjunto si está presente.
        Retorna true si el elemento se eliminó exitosamente, false si no estaba presente.
         */

        Set<String> nombres2 = new HashSet<>();
        nombres2.add("Juan");
        nombres2.add("Pedro");
        nombres2.add("María");
        boolean resultado2 = nombres2.remove("Pedro");
        System.out.println(resultado2); // Imprime true, porque "Pedro" se eliminó correctamente.

        /*
        contains(elemento): Retorna true si el conjunto contiene el elemento especificado,
        false en caso contrario.
         */

        Set<String> nombres3 = new HashSet<>();
        nombres3.add("Juan");
        nombres3.add("Pedro");
        nombres3.add("María");
        boolean resultado3 = nombres3.contains("Pedro");
        System.out.println(resultado3); // Imprime true, porque el conjunto contiene "Pedro".

        /*
        size(): Retorna el número de elementos en el conjunto
         */

        Set<String> nombres4 = new HashSet<>();
        nombres4.add("Juan");
        nombres4.add("Pedro");
        nombres4.add("María");
        int cantidad = nombres4.size();
        System.out.println(cantidad); // Imprime 3.

        /*
        clear(): Elimina todos los elementos del conjunto.
         */

        Set<String> nombres5 = new HashSet<>();
        nombres5.add("Juan");
        nombres5.add("Pedro");
        nombres5.add("María");
        nombres5.clear();
        System.out.println(nombres5.size()); // Imprime 0.

        /*
        isEmpty(): Retorna true si el conjunto no contiene elementos, false en caso contrario.
         */

        Set<String> nombres6 = new HashSet<>();
        System.out.println(nombres6.isEmpty()); // Imprime true.
        nombres6.add("Juan");
        System.out.println(nombres6.isEmpty()); // Imprime false.

    }
}

