import java.util.Scanner;

public class C0030DoWhile {
    public static void main(String[] args) {

/*
En este ejemplo, usaremos un bucle do-while para pedir al usuario que ingrese un
número hasta que ingrese un número negativo.
 */

        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número (ingrese un número negativo para salir): ");
            numero = scanner.nextInt();
        } while (numero >= 0);
        System.out.println("¡Hasta luego!");
    }
}

/*
En este código, utilizamos un bucle do-while para pedir al usuario que ingrese un número.
La variable numero almacena el número ingresado por el usuario.
Después de pedir al usuario que ingrese un número, la condición del bucle do-while comprueba
si numero es mayor o igual a 0. Si es así, el bucle se repetirá y volverá a pedir al usuario
que ingrese un número. Si numero es menor que 0, la condición del bucle do-while será falsa
y el bucle se detendrá.

Después de que el usuario ingrese un número negativo y el bucle do-while se detenga,
el programa imprimirá "¡Hasta luego!" en la pantalla.

Este bucle do-while es útil cuando queremos asegurarnos de que el código dentro del bucle
se ejecute al menos una vez, sin importar si la condición del bucle es verdadera o falsa en
la primera iteración.
 */