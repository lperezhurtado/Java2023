import java.util.Arrays;
import java.util.Scanner;

public class C015EjercicioCadenaVacia {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String cadena = sc.nextLine();

        String nuevaCadena = cadena.replaceAll("[^a-zA-Z]", "");

        System.out.println("La cadena sin caracteres no alfabéticos es: " + nuevaCadena);
        }
    }

        /*
        En este programa, se le pide al usuario que ingrese una cadena de caracteres.
        Luego, se utiliza el método replaceAll() de la clase String para reemplazar todos
        los caracteres que no sean letras con una cadena vacía.
        El patrón "[^a-zA-Z]" indica que se deben reemplazar todos los caracteres que no están
        en el rango de letras de la A a la Z, tanto en mayúsculas como en minúsculas.
        Se guarda el resultado en una nueva cadena llamada nuevaCadena.
        Finalmente, se imprime la nueva cadena en la consola.
         */