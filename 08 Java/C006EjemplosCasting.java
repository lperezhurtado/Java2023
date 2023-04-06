public class C006EjemplosCasting {
    public static void main(String[] args) {

        //---------------------------------------------
        //Ejemplo1
        //---------------------------------------------

        int num1 = 10;
        double num2 = 5.5;
        double resultado = num1 + num2;

        int resultadoCasteado = (int) resultado;
        System.out.println(resultadoCasteado);

        /*
        En este ejemplo, primero definimos dos variables: num1 como un entero y
        num2 como un número de punto flotante de doble precisión (double). Luego,
        sumamos num1 y num2 y almacenamos el resultado en resultado, que es de tipo double.
        Finalmente, hacemos un casting de resultado a un entero usando (int) y
        lo almacenamos en la variable resultadoCasteado.
        La función System.out.println() imprime el valor de resultadoCasteado que es 15.
        */

        //---------------------------------------------
        //Ejemplo2
        //---------------------------------------------

        int num3 = 10;
        double num4 = 5.5;
        int resultado2 = (int) (num3 + num4);
        System.out.println(resultado);

        /* Aquí, definimos dos variables: num3 como un entero y num4 como un número de
        punto flotante de doble precisión (double). Luego, sumamos num3 y num4, y luego
        realizamos un casting del resultado a un entero usando (int).
        La función System.out.println() imprime el valor de resultado que es 15.
        */


        //---------------------------------------------
        //Ejemplo3
        //---------------------------------------------

        int num5 = 10;
        double num6 = 5.5;
        String resultado3 = String.valueOf(num5) + String.valueOf(num6);
        System.out.println(resultado);

        /*
        En este ejemplo, definimos dos variables: num5 como un entero y num6
        como un número de punto flotante de doble precisión (double). Luego,
        utilizamos la función String.valueOf() para convertir num5 y num6 en
        cadenas de caracteres. Después, concatenamos ambas cadenas y las almacenamos
        en la variable resultado. La función System.out.println() imprime el valor
        de resultado que es 105.5
        */

        //---------------------------------------------
        //Ejemplo4
        //---------------------------------------------
        int num7 = 10;
        double num8 = 5.5;
        String resultado4 = String.valueOf(num7) + String.valueOf(num8);
        int resultadoCasteado2 = (int) Double.parseDouble(resultado4);
        System.out.println(resultadoCasteado);


        /*En este ejemplo, definimos dos variables: num7 como un entero y num8 como
        un número de punto flotante de doble precisión (double). Luego, utilizamos
        la función String.valueOf() para convertir num7 y num8 en cadenas de caracteres.
        Después, concatenamos ambas cadenas y las almacenamos en la variable resultado.
        Luego, utilizamos la función Double.parseDouble() para convertir resultado en
        un valor de punto flotante. Finalmente, hacemos un casting de resultado a un
        entero usando (int) y lo almacenamos en la variable resultadoCasteado.
        La función System.out.println() imprime el valor de resultadoCasteado que es 105
        */
    }
}
