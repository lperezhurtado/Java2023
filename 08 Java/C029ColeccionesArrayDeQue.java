import java.util.ArrayDeque;

public class C029ColeccionesArrayDeQue {
    public static void main(String[] args) {

        // Crear un ArrayDeque vacío
        ArrayDeque<String> deque1 = new ArrayDeque<>();

        // Añadir elementos al final de la cola
        deque1.offerLast("elemento1");
        deque1.offerLast("elemento2");
        deque1.offerLast("elemento3");
        System.out.println(deque1.toString()); // Imprime [elemento1, elemento2, elemento3]

        // Añadir elementos al principio de la cola
        deque1.offerFirst("elemento0");
        System.out.println(deque1.toString()); // Imprime [elemento0, elemento1, elemento2, elemento3]

        // Obtener y eliminar el primer elemento de la cola
        String primerElemento = deque1.pollFirst();
        System.out.println(primerElemento); // Imprime "elemento0"
        System.out.println(deque1.toString()); // Imprime [elemento1, elemento2, elemento3]

        // Obtener y eliminar el último elemento de la cola
        String ultimoElemento = deque1.pollLast();
        System.out.println(ultimoElemento); // Imprime "elemento3"
        System.out.println(deque1.toString()); // Imprime [elemento1, elemento2]

        // Obtener el primer elemento de la cola sin eliminarlo
        String primerElemento2 = deque1.peekFirst();
        System.out.println(primerElemento2); // Imprime "elemento1"

        // Obtener el último elemento de la cola sin eliminarlo
        String ultimoElemento2 = deque1.peekLast();
        System.out.println(ultimoElemento2); // Imprime "elemento2"

        // Obtener la cantidad de elementos en la cola
        int tamano = deque1.size();
        System.out.println("La cola tiene " + tamano + " elementos.");

        // Verificar si la cola contiene un elemento dado
        boolean contiene = deque1.contains("elemento1");
        System.out.println("¿Contiene elemento1? " + contiene); // Imprime "¿Contiene elemento1? true"

        // Vaciar la cola
        deque1.clear();
        System.out.println(deque1.toString()); // Imprime []
    }
}

