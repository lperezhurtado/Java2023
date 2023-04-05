import java.util.Scanner;

public class C0031Ejercicio02 {
    public static void main(String[] args) {

/*
Escribe un programa en Java que lea un número entero positivo desde la consola y
compruebe si es un número primo. Si el número es primo, el programa deberá imprimir
un mensaje indicando que el número es primo. Si el número no es primo, el programa
deberá imprimir un mensaje indicando que el número no es primo y mostrar los factores
por los que el número es divisible.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                System.out.println(numero + " no es un número primo.");
                System.out.println("Los factores por los que " + numero + " es divisible son " + i + " y " + (numero/i) + ".");
                break;
            }
        }
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
    }
}}

/*
En este código, utilizamos un bucle for para iterar sobre todos los números enteros
desde 2 hasta la mitad del número ingresado por el usuario. En cada iteración,
comprobamos si el número ingresado por el usuario es divisible por el número actual del bucle for.
Si es así, establecemos la variable esPrimo en false y mostramos los factores por los
que el número es divisible.

Si encontramos un factor que divide al número, salimos del bucle utilizando break ya que
el número no es primo. Si no encontramos ningún factor que divide al número,
la variable esPrimo se mantiene como true y el programa imprime un mensaje indicando
que el número es primo
 */