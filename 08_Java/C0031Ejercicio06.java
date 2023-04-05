/*
Enunciado:
Escribe un programa en Java que simule el juego Piedra, Papel o Tijeras.
El programa debe permitir al usuario ingresar su jugada y generar una jugada
aleatoria para la computadora. Luego, debe imprimir quién ganó la ronda
(o si hubo empate) y llevar un registro de las victorias del usuario y de la
computadora hasta que uno de los dos llegue a 3 victorias.
 */

import java.util.Random;
import java.util.Scanner;

public class C0031Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int victoriasUsuario = 0;
        int victoriasComputadora = 0;

        while (victoriasUsuario < 3 && victoriasComputadora < 3) {
            System.out.println("Juega Piedra, Papel o Tijeras");
            System.out.print("Ingresa tu jugada (1: Piedra, 2: Papel, 3: Tijeras): ");
            int jugadaUsuario = sc.nextInt();
            int jugadaComputadora = rnd.nextInt(3)+1; //(0, 3) 0 incluido, el 3 no incluido

            if (jugadaUsuario == jugadaComputadora) {
                System.out.println("Empate");
            } else if ((jugadaUsuario == 1 && jugadaComputadora == 3) ||
                    (jugadaUsuario == 2 && jugadaComputadora == 1) ||
                    (jugadaUsuario == 3 && jugadaComputadora == 2)) {
                System.out.println("Ganaste esta ronda");
                victoriasUsuario++;
            } else {
                System.out.println("Perdiste esta ronda");
                victoriasComputadora++;
            }
        }

        if (victoriasUsuario > victoriasComputadora) {
            System.out.println("¡Ganaste el juego!");
        } else {
            System.out.println("La computadora ganó el juego");
        }


    }
}

/*
Explicación:
El programa utiliza un bucle while que se ejecuta hasta que uno de los dos jugadores
llegue a 3 victorias. En cada iteración del bucle, el programa solicita al usuario
que ingrese su jugada y genera una jugada aleatoria para la computadora utilizando la clase Random.
Luego, utiliza una serie de condicionales para determinar quién ganó la ronda y actualiza
el contador de victorias del jugador correspondiente. Al final del juego, el programa
imprime quién ganó el juego en función de quién tiene más victorias.
 */