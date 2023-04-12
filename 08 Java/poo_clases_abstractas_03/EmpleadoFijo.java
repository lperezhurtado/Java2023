package poo_clases_abstractas_03;

public class EmpleadoFijo extends Empleado {
    private double salarioBase;
    private double bono;

    public EmpleadoFijo(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public double calcularSalario() {
        return salarioBase + bono;
    }
}
