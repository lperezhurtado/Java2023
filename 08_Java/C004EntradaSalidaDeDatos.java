import javax.swing.*;
import java.util.Scanner;

public class C004EntradaSalidaDeDatos {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número:"));

        System.out.println(((Object) valor).getClass().getSimpleName());
        System.out.println("El valor introducido es " + valor);
        System.out.println("El valor introducido + 1000 es: " + (valor + 1000));

        String mensaje = "";
        mensaje += valor + " en binario es: " + Integer.toBinaryString(valor) + "\n";
        mensaje += valor + " en hexadecimal es: " + Integer.toHexString(valor) + "\n";
        mensaje += valor + " en octal es: " + Integer.toOctalString(valor) + "\n";

        JOptionPane.showMessageDialog(null, mensaje);

        //-------------------------------------------------
        //Scanner
        //-------------------------------------------------
        try {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Introduzca un número: ");
            int valor2 = Integer.parseInt(Scanner.nextLine()); //Interrumpe la ejecución hasta que hay dato de entrada.
            //Esta conversión se puede evitar poniendo Scanner.nextInt();
            int valor3 = Scanner.nextInt();

            System.out.println("El número introducido es el : " + valor2);
        } catch(NumberFormatException e) {
            System.out.println("Error. Introduzca un número entero.");
            main(args);
            System.exit(0);
        }


    }
}
