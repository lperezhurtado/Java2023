/*
Enunciado:
Escribe un programa en Java que genere un número aleatorio entre 1 y 1000, y solicite
al usuario que adivine cuál es ese número en un máximo de 10 intentos. Si el usuario
adivina el número antes de que se agoten los intentos, el programa debe imprimir un
mensaje indicando que ha ganado y la cantidad de intentos utilizados. Si el usuario
no adivina el número en los 10 intentos, el programa debe imprimir un mensaje indicando
que ha perdido y el número que debía adivinar.
 */

import java.util.Random;
import java.util.Scanner;

public class C0031Ejercicio07 {
    public static void main(String[] args) {

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(1000) + 1;
        int intentos = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número aleatorio entre 1 y 1000 en un máximo de 10 intentos.");

        while (intentos > 0) {
            System.out.println("Introduce tu número: ");
            int numero = scanner.nextInt();
            intentos--;

            if (numero == numeroAleatorio) {
                System.out.println("¡Has ganado! El número era " + numeroAleatorio + " y has utilizado " + (10 - intentos) + " intentos.");
                return;
            } else if (intentos == 0) {
                System.out.println("Lo siento, has perdido. El número era " + numeroAleatorio + ".");
            } else {
                System.out.println("No has adivinado. Te quedan " + intentos + " intentos.");
                if (numero > numeroAleatorio) {
                    System.out.println("El número que buscas es menor.");
                } else {
                    System.out.println("El número que buscas es mayor.");
                }
            }
        }

    }
}

/*
Explicación:
El programa utiliza la clase Random para generar un número aleatorio entre 1 y 1000.
Después, solicita al usuario que introduzca un número y lo compara con el número aleatorio generado.
Si el usuario acierta, se imprime un mensaje indicando que ha ganado y la cantidad de intentos utilizados.
Si el usuario no adivina el número en los 10 intentos, se imprime un mensaje indicando que ha
perdido y se muestra el número que debía adivinar.

El programa utiliza un bucle while para permitir al usuario adivinar el número en un máximo de 10 intentos.
Dentro del bucle, se solicita al usuario que introduzca un número, se compara con el número
aleatorio generado y se decrementa la variable intentos. Si el número es igual al número aleatorio
generado, se imprime un mensaje indicando que ha ganado. Si el número no es igual al número
aleatorio generado y no quedan intentos, se imprime un mensaje indicando que ha perdido.
Si el número no es igual al número aleatorio generado pero aún quedan intentos, se imprime un
mensaje indicando cuántos intentos quedan y si el número que busca el usuario es mayor o menor
que el número aleatorio generado.
 */