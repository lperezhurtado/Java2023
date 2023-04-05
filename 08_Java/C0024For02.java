

/*
Escribe un programa que pida al usuario dos números enteros y muestre
los números enteros entre ellos en orden ascendente y descendente.
 */

import java.util.Scanner;

public class C0024For02 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce el primer número: ");
                int num1 = sc.nextInt();

                System.out.print("Introduce el segundo número: ");
                int num2 = sc.nextInt();

                System.out.println("Números entre " + num1 + " y " + num2 + " en orden ascendente:");

                if (num1 < num2) {
                    for (int i = num1; i <= num2; i++) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = num1; i >= num2; i--) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println("\nNúmeros entre " + num1 + " y " + num2 + " en orden descendente:");

                if (num1 > num2) {
                    for (int i = num1; i >= num2; i--) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = num1; i <= num2; i++) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

/*
        Explicación: Primero, se importa la clase Scanner para poder pedir al
        usuario dos números enteros. Luego, se solicita al usuario que introduzca los dos números.

        Después, se utiliza un condicional if para determinar si el primer número es
        menor o mayor que el segundo número. Si el primer número es menor que el segundo,
        se utiliza un bucle for para imprimir los números enteros entre num1 y num2 en orden ascendente.
        Si el primer número es mayor que el segundo, se utiliza otro bucle for para imprimir
        los números enteros entre num1 y num2 en orden descendente.

        Por último, se imprime un mensaje para indicar que se van a mostrar los números en orden
        descendente y se utiliza un condicional if para determinar si el primer número es mayor
        o menor que el segundo número. Si el primer número es mayor que el segundo,
        se utiliza un bucle for para imprimir los números enteros entre num1 y num2 en orden descendente.
        Si el primer número es menor que el segundo, se utiliza otro bucle for para imprimir
        los números enteros entre num1 y num2 en orden ascendente.

        Con este ejercicio, el alumno practicará el uso de un bucle for para imprimir una
        serie de números enteros en orden ascendente y descendente, dependiendo de los valores
        introducidos por el usuario. Además, se trabaja con condicionales if para determinar
        el orden de los números y para imprimir mensajes informativos.
*/


