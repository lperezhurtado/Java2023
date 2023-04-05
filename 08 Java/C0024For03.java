public class C0024For03 {
    public static void main(String[] args) {

        for (int i = 1, j = 10; i <= j; i++, j--) {
            System.out.println(i + " " + j);
        }
    }
}

/*
En este ejemplo, se utiliza un solo bucle for para iterar sobre dos variables
diferentes, i y j, que comienzan en valores diferentes pero tienen la misma condición de finalización.

Dentro del bucle for, se utilizan las expresiones de incremento y decremento i++ y j--
para actualizar los valores de i y j en cada iteración.
En cada iteración, se utiliza la función System.out.println() para imprimir los valores
actuales de i y j.

La salida de este ejemplo sería:
1 10
2 9
3 8
4 7
5 6

Como puedes ver, en cada iteración del bucle for, se imprime el valor actual de i y j,
que comienzan en 1 y 10 respectivamente, y se actualizan en cada iteración.
El bucle se detiene cuando i es mayor que j, lo que ocurre después de la quinta iteración.
 */