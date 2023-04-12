package poo_clases_abstractas_03;

public class EmpleadoTemporal extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int edad, double salarioPorHora, int horasTrabajadas) {
        super(nombre, edad);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}