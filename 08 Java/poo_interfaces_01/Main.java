
/*
tenemos una lista de objetos que deseamos ordenar según un criterio específico,
como el orden alfabético de un campo de texto o la clasificación por orden numérico.
Podemos definir una interfaz llamada Comparable que establece un contrato para que
los objetos que la implementen puedan ser ordenados. La interfaz Comparable tiene un
único método, compareTo(), que compara el objeto actual con otro objeto y devuelve un
valor negativo, cero o positivo dependiendo de si el objeto actual es menor, igual o
mayor que el objeto comparado.
 */

package poo_interfaces_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        Ahora podemos ordenar una lista de personas utilizando el método Collections.sort()
        de Java, que utiliza la interfaz Comparable para determinar el orden de los objetos:
         */

        List<Persona> listaDePersonas = new ArrayList<>();
        listaDePersonas.add(new Persona("Juan"));
        listaDePersonas.add(new Persona("Ana"));
        listaDePersonas.add(new Persona("Carlos"));
        Collections.sort(listaDePersonas);

        for (Persona persona : listaDePersonas) {
            System.out.println(persona.getNombre());
        }



    }
}
