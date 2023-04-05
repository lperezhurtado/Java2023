import java.util.Arrays;
import java.util.Scanner;

public class C012Anagrama2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera cadena:");
        String cadena1 = sc.nextLine().toLowerCase().replaceAll("\\s", ""); // convertir a minúsculas y eliminar espacios
        System.out.println("Ingrese la segunda cadena:");
        String cadena2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        if (cadena1.length() != cadena2.length()) {
            System.out.println("Las cadenas no son anagramas.");
        } else {
            char[] cadena1Array = cadena1.toCharArray();
            char[] cadena2Array = cadena2.toCharArray();
            Arrays.sort(cadena1Array);
            Arrays.sort(cadena2Array);

            if (Arrays.equals(cadena1Array, cadena2Array)) {
                System.out.println("Las cadenas son anagramas.");
            } else {
                System.out.println("Las cadenas no son anagramas.");
            }
        }
    }}

        /*
        En este programa, se le pide al usuario que ingrese las dos cadenas de caracteres.
        Luego, se eliminan los espacios en blanco y se convierten todas las letras a minúsculas
        para facilitar la comparación.
        Se verifica si las cadenas tienen la misma longitud. Si no es así, se imprime un mensaje
        indicando que las cadenas no son anagramas.
        Si ambas cadenas tienen la misma longitud, se convierten en arreglos de caracteres y
        se ordenan alfabéticamente usando la clase Arrays.
        Finalmente, se verifica si los arreglos de caracteres son iguales utilizando el
        método equals() de la clase Arrays.
        Si los arreglos son iguales, entonces las cadenas son anagramas. De lo contrario, no lo son.
         */