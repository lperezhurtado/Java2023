package POO01;

public class Main {
    public static void main(String[] args) {

        // Declaración de una instancia de la clase Coche
        Coche miCoche;

        // Instanciación de la clase Coche
        miCoche = new Coche("Toyota", "Corolla", 2022, 25000.00);

        // Acceso a los atributos de la instancia
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Año: " + miCoche.getAnio());
        System.out.println("Precio: $" + miCoche.getPrecio());

        // Modificación de un atributo de la instancia
        miCoche.setPrecio(28000.00);
        System.out.println("Precio modificado: $" + miCoche.getPrecio());
    }
}
