
/*

Enunciado:
Escribe un programa en Java que pida al usuario ingresar dos números enteros positivos.
El programa debe imprimir la tabla de multiplicar desde el número menor hasta el número mayor.

*/

import java.util.Scanner;

public class C0031Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();

        int menor = num1;
        int mayor = num2;
        if (num2 < num1) {
            menor = num2;
            mayor = num1;
        }

        for (int i = menor; i <= mayor; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();

    }
}}

/*
Explicación:
En este programa utilizamos la clase Scanner para solicitar al usuario que ingrese dos
números enteros positivos. Luego, verificamos cuál de los dos números es el menor y cuál es el mayor.
Para ello, utilizamos una estructura condicional if.

Después, utilizamos un bucle for que va desde el número menor hasta el número mayor.
Dentro de este bucle, utilizamos otro bucle for para imprimir la tabla de multiplicar
del número correspondiente.

Para calcular cada resultado de la tabla de multiplicar, utilizamos la fórmula i * j,
donde i es el número de la tabla y j va desde 1 hasta 10. Finalmente, imprimimos un salto
de línea para separar las tablas de multiplicar de cada número.
 */