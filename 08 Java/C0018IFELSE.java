/*
     Media de notas de un alumno. Pedimos tres notas por scanner y sacamos la media:
     0-5 => suspenso
     5-6 => Bien
     6-9 => Notable
     10  =>Sobresaliente
 */

import java.util.Scanner;

public class C0018IFELSE {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Introduce la primera nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Introduce la segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.println("Introduce la tercera nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Tu media es: " + media);

        if (media >= 0 && media < 5) {
            System.out.println("Tu calificación es SUSPENSO.");
        } else if (media >= 5 && media < 6) {
            System.out.println("Tu calificación es BIEN.");
        } else if (media >= 6 && media < 9) {
            System.out.println("Tu calificación es NOTABLE.");
        } else if (media == 10) {
            System.out.println("Tu calificación es SOBRESALIENTE.");
        } else {
            System.out.println("Error: la media introducida no es válida.");
        }
    }
}
