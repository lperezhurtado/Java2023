/*
Enunciado: Escribe un programa en Java que solicite al usuario ingresar una cadena de texto.
El programa debe imprimir cuántas vocales y cuántas consonantes tiene la cadena
 */


import java.util.Scanner;

public class C0031Ejercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadena = sc.nextLine().toLowerCase();

        int numVocales = 0;
        int numConsonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVocales++;
            } else if (Character.isLetter(c)) {
                numConsonantes++;
            }
        }

        System.out.println("La cadena tiene " + numVocales + " vocales y " + numConsonantes + " consonantes.");
    }}

/*
Explicación:
En este programa utilizamos la clase Scanner para solicitar al usuario que ingrese una cadena de texto.
Luego, convertimos la cadena a minúsculas utilizando el método toLowerCase() para facilitar
la comparación de caracteres.

Creamos dos variables numéricas, una para contar las vocales y otra para contar las consonantes.
Utilizamos un bucle for para recorrer la cadena de texto caracter por caracter.
Para cada caracter, utilizamos una estructura condicional if-else para determinar si es una vocal
o una consonante. Si es una vocal, incrementamos la variable numVocales en uno.
Si es una consonante, incrementamos la variable numConsonantes en uno.

Para determinar si un caracter es una letra, utilizamos el método isLetter() de la clase Character.
Finalmente, imprimimos el resultado con el número de vocales y consonantes encontradas en la cadena.






 */