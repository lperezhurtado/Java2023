/*
Enunciado:
Escribe un programa que solicite al usuario un número entero positivo N, y muestre
por pantalla los N primeros números de la serie de Fibonacci.
La serie de Fibonacci se define como una sucesión de números en la que cada número
es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...).
 */

import java.util.Scanner;

public class C0031Ejercicio08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, a = 0, b = 1, c;

        do {
            System.out.print("Introduce un número entero positivo: ");
            n = input.nextInt();
        } while (n <= 0);

        System.out.print("Los " + n + " primeros números de la serie de Fibonacci son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }


    }
}

/*
Explicación:
Primero se importa la clase Scanner para poder solicitar la entrada del usuario.
Luego se define la variable n para almacenar el número de elementos de la serie de
Fibonacci que el usuario desea ver.

Después, se utiliza un bucle do-while para asegurarse de que el usuario ingrese un
número entero positivo. A continuación, se inicializan las variables a y b en 0 y 1
respectivamente, ya que estos son los dos primeros números de la serie de Fibonacci.

Luego se muestra por pantalla un mensaje que indica la cantidad de números de la
serie de Fibonacci que se van a mostrar. Se utiliza un bucle for para iterar n veces
y mostrar los números de la serie. En cada iteración se muestra el valor de a y se
calcula el siguiente valor de la serie como la suma de a y b. Luego, se actualizan
los valores de a y b para la siguiente iteración.

Este programa utiliza la lógica de la serie de Fibonacci para calcular los números
y mostrarlos en pantalla
 */