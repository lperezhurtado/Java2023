
//Convertir grados Celsius a grados Fahrenheit

import java.util.Scanner;

public class C0022SwitchCase03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("¿Quieres convertirla a grados Fahrenheit (F) o a Kelvin (K)? ");
        char opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'F':
                double fahrenheit = (celsius * 1.8) + 32;
                System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");
                break;
            case 'K':
                double kelvin = celsius + 273.15;
                System.out.println(celsius + " grados Celsius equivalen a " + kelvin + " grados Kelvin");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
