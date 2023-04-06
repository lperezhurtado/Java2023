package POO01;

public class Coche extends Vehiculo {
    private double precio;

    public Coche(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void frenar() {
        System.out.println("Frenando el coche...");
    }
}
