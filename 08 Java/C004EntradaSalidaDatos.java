import javax.swing.*;
import java.util.Scanner;

public class C004EntradaSalidaDatos {
    public static void main(String[] args) {

        int valor =  Integer.parseInt(JOptionPane.showInputDialog("introduzca un número"));
        System.out.println("El valor introducido +100 es " + (valor + 100));

        System.out.println( valor + " en binario es: " + Integer.toBinaryString(valor) + "\n");
        System.out.println( valor + " en octal es: " + Integer.toOctalString(valor) + "\n");
        System.out.println( valor + " en hexadecimal es: " + Integer.toHexString(valor) + "\n");

        JOptionPane.showMessageDialog(null, valor);


        //Scanner

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int valor2 = Integer.parseInt(miScanner.nextLine());
        // Con esta opción no necesitamos casting:    int valor3 = miScanner.nextInt();
        System.out.println(valor2);






    }
}
