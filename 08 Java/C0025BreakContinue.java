public class C0025BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue; // Saltar a la siguiente iteración si i es igual a 3 o 7
            }
            if (i == 9) {
                break; // Salir del bucle si i es igual a 9
            }
            System.out.print(i + " ");
        }
    }
}

/*
    En este ejemplo, se utiliza un bucle for para iterar sobre los números del 1 al 10.
    Dentro del bucle, se utilizan las instrucciones continue y break para controlar el flujo del programa.

    La instrucción continue permite saltar a la siguiente iteración del bucle sin ejecutar el código
    que se encuentra a continuación. En este ejemplo, se utiliza continue para saltar las iteraciones
    en las que i es igual a 3 o 7.

    La instrucción break permite salir del bucle inmediatamente si se cumple una determinada condición.
    En este ejemplo, se utiliza break para salir del bucle cuando i es igual a 9.

    La salida de este ejemplo sería:
        1 2 4 5 6 8

    Como puedes ver, se han saltado los números 3 y 7 utilizando continue, y se ha salido
    del bucle después de imprimir el número 8 utilizando break.
 */