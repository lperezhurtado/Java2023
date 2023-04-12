package poo_interfaces_03;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void moverse() {
        System.out.println(nombre + " se está moviendo");
    }
}
