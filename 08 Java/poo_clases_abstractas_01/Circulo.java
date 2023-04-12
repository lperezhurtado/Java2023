package poo_clases_abstractas_01;

public class Circulo extends FormasGeometricas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
