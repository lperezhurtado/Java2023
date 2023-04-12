
/*
En este ejemplo, la clase Perro hereda el atributo nombre y el método moverse() de la clase Animal.
Además, implementa el método esDomestico() de la interfaz Domestico y agrega un nuevo método
ladrar() que imprime un mensaje en la consola indicando que el perro está ladrando.
 */

package poo_interfaces_03;

public class Perro extends Animal implements Domestico {
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando");
    }


    public boolean esDomestico() {
        return true;
    }
}
