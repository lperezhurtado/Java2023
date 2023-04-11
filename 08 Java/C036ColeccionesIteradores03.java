import java.util.*;


public class C036ColeccionesIteradores03 {
    public static void main(String[] args) {

        /*
        Supongamos que tenemos una lista de objetos Persona y queremos modificar el
        nombre de todas las personas que tengan más de 30 años. Podemos hacer esto recorriendo
        la lista con un iterador y llamando al método set() del iterador para modificar el
        nombre de las personas que cumplan con la condición
         */

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 35));
        personas.add(new Persona("Pedro", 42));
        personas.add(new Persona("María", 28));

        List<Persona> personasModificadas = new ArrayList<>();

        Iterator<Persona> iterador = personas.iterator();

        while (iterador.hasNext()) {
            Persona persona = iterador.next();
            if (persona.getEdad() > 30) {
                Persona personaModificada = new Persona(persona.getNombre() + " Senior", persona.getEdad());
                personasModificadas.add(personaModificada);
            } else {
                personasModificadas.add(persona);
            }
        }

// Reemplazar la lista original con la lista modificada
        personas.clear();
        personas.addAll(personasModificadas);

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        }

    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    }


