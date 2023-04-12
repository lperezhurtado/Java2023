package poo_interfaces_01;

/*
Para usar la interfaz Comparable, podemos hacer que nuestros objetos implementen esta
interfaz y proporcionen una implementación de compareTo() que tenga en cuenta el
criterio de ordenamiento. Por ejemplo, si tenemos una clase Persona con un campo de
texto nombre, podemos hacer que la clase implemente Comparable y proporcione una
implementación que ordene las personas por su nombre:
 */

public class Persona implements Comparable<Persona> {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int compareTo(Persona otraPersona) {
        return this.nombre.compareTo(otraPersona.getNombre());
    }
}
