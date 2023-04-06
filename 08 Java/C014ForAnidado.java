public class C014ForAnidado {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
En este ejemplo, se utilizan dos bucles for anidados para imprimir una serie
de números en forma de triángulo.
El primer bucle for itera sobre los números del 1 al 5, y el segundo bucle for itera
sobre los números del 1 al valor actual de i.
Dentro del segundo bucle for, se utiliza la función System.out.print() para imprimir
La salida de este ejemplo sería:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Como puedes ver, el primer bucle for se ejecuta 5 veces, y para cada valor de i,
el segundo bucle for se ejecuta i veces, imprimiendo los números del 1 al i.
De esta forma, se crea un triángulo de números.
 */