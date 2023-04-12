
/*
En este ejemplo, veremos cómo una clase puede heredar de otra clase y, al mismo tiempo, implementar una interfaz.

Supongamos que tenemos una clase Animal que define algunas características y comportamientos
básicos de un animal, como su nombre y su capacidad para moverse. Además, tenemos una interfaz
Domestico que define un método esDomestico() que indica si el animal es o no un animal doméstico.
 */

package poo_interfaces_03;

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido");
        miPerro.moverse();
        miPerro.ladrar();
        System.out.println( miPerro.esDomestico());
    }
}
