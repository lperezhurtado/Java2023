package poo_interfaces_02;

public class Automovil implements Encendible, Manejable {
    private boolean encendido;
    private int velocidadActual;

    public void encender() {
        encendido = true;
        System.out.println("El automóvil está encendido");
    }

    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        System.out.println("El automóvil está acelerando a " + velocidadActual + " km/h");
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automóvil está frenando");
    }
}
