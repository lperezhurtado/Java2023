public class C0024For {
    public static void main(String[] args) {

        /*
        En Java existen cuatro tipos de bucles for:
        el for tradicional, el for-each, el for con declaraciones múltiples y el for infinito.
        A continuación te presento ejemplos de cada uno de ellos con su respectivo código y explicación:
         */


        //Ejemplo 1: Bucle for tradicional

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        /*
        Explicación: Este es el bucle for más común en Java.
        Se compone de tres partes separadas por puntos y coma (;):
        la inicialización, la condición y la actualización.
        En la inicialización se declara y se inicializa la variable de
        control del bucle (i en este caso), en la condición se especifica la
        condición de salida del bucle (i < 5 en este caso) y en la actualización
        se especifica cómo se actualizará la variable de control después de cada
        iteración (i++ en este caso).
        En el cuerpo del bucle se coloca el código que se desea ejecutar en cada iteración.
         */


        //Ejemplo 2: Bucle for-each

        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            System.out.println("Valor del número: " + numero);
        }

        /*
        Explicación: El bucle for-each se utiliza para recorrer colecciones (como arrays)
        de manera más sencilla y eficiente.
        Se compone de dos partes separadas por dos puntos (:):
        la variable de iteración y la colección a recorrer.
        En este ejemplo, la variable de iteración es numero y la colección a recorrer es numeros,
        que es un arreglo de enteros. En cada iteración, la variable numero tomará el valor
        de uno de los elementos del arreglo y se ejecutará el código del cuerpo del bucle.
         */


        //Ejemplo 3: Bucle for con declaraciones múltiples

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("Valor de i: " + i);
            System.out.println("Valor de j: " + j);
        }

        /*

        Explicación: Este tipo de bucle for permite declarar y/o inicializar varias
        variables de control del bucle en la sección de inicialización del bucle.
        En este ejemplo se declaran e inicializan dos variables (i y j) separadas
        por una coma (,). Además, se utiliza la sección de actualización para actualizar
        ambas variables de control después de cada iteración (i++ y j--).
        En el cuerpo del bucle se imprime el valor de ambas variables de control en cada iteración.
        */


        //Ejemplo 4: Bucle for infinito

        for (;;) {
            // código infinito
        }

        /*
        Explicación: Este tipo de bucle for no tiene una condición de salida,
        por lo que se ejecutará de manera infinita.
        Se utiliza en situaciones muy específicas donde se necesita un ciclo que
        se ejecute continuamente hasta que se interrumpa manualmente (por ejemplo,
        un servidor que esté esperando conexiones). En el cuerpo del bucle se coloca
        el código que se desea ejecutar de manera infinita.
        */
    }
}