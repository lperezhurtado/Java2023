
/*
En este ejemplo, la clase Producto implementa el método calcularPrecio() de la interfaz Vendible
y define tres atributos (nombre, descripcion y precio) con sus correspondientes métodos de acceso.

Ahora, podemos crear subclases de Producto para cada tipo de producto específico, como por ejemplo
la clase Libro que agrega un nuevo atributo (autor) y redefine el método calcularPrecio() para
incluir un descuento del 10% sobre el precio base.
 */

package poo_interfaces_04;

public class Producto implements Vendible {
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
