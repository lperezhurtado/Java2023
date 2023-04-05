import java.util.Scanner;

public class C0031Ejercicio01 {
    public static void main(String[] args) {

/*
Escribe un programa en Java que pida al usuario ingresar una secuencia de números enteros positivos.
El programa debe imprimir la suma de los números ingresados, pero debe ignorar aquellos que
son múltiplos de 3 y detener el bucle cuando la suma de los números ingresados sea mayor o igual a 20
 */

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = 0;

        while (suma < 20) {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero % 3 == 0) {
                continue; // omitir el número si es múltiplo de 3
            }
            suma += numero;
            if (suma >= 20) {
                break; // salir del bucle si la suma es mayor o igual a 20
            }
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

/*

En este programa, utilizamos un bucle while para pedir al usuario que ingrese una secuencia
de números enteros positivos. La variable suma almacena la suma de los números ingresados y
se inicializa en cero al principio del programa. La variable numero se utiliza para almacenar
el número ingresado por el usuario en cada iteración.

Dentro del bucle while, utilizamos la declaración continue para omitir cualquier número que
sea múltiplo de 3, ya que queremos ignorar esos números. Luego, sumamos el número ingresado
a la variable suma. Si la suma es mayor o igual a 20, utilizamos la declaración break para salir del bucle.

Finalmente, imprimimos la suma de los números ingresados en la pantalla.

Este programa es un ejemplo práctico del uso de break y continue en un bucle while.
La declaración continue nos permite omitir iteraciones del bucle, mientras que la declaración
break nos permite salir del bucle prematuramente en función de una condición específica.
En este caso, utilizamos ambas declaraciones para ignorar los múltiplos de 3 y detener el
bucle cuando la suma de los números ingresados sea mayor o igual a 20.
 */