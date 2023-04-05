/*
    DÍAS SEGÚN MES DEL AÑO.

    Crear un script que pida por Scanner un mes del año del 1-12.
    Nos debe decir el número de días que tiene dicho mes.
    Notas:
    Meses con 30 días:  4, 6, 9, 11.
    Meses con 31 días:  1, 3, 5, 7, 8, 10, 12.
    Para el control de días de febrero, el algoritmo que calcula si un año es bisiesto es.
    Un año es bisiesto si es divisible por 4, pero no si es divisible por 100, a menos
    que también sea divisible por 400:

                if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
 */

import java.util.Scanner;

public class C0019EjercicioIFELSE01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = s.nextInt();

        int numeroDias = 0;
        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt();

        if(mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        } else if(mes == 2){
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);

    }
}
