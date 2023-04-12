
/*
Supongamos que estamos desarrollando un sistema de venta de productos en Java.
En nuestro sistema, tenemos diferentes tipos de productos, como libros, electrónicos
y productos de moda. Cada producto tiene un nombre, una descripción y un precio.

Para implementar la lógica de nuestro sistema de venta, creamos una interfaz llamada Vendible
que define un método calcularPrecio() que devuelve el precio del producto.
 */

package poo_interfaces_04;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("El Principito", "Novela filosófica", 20.0, "Antoine de Saint-Exupéry");
        System.out.println(miLibro.getNombre());
        System.out.println(miLibro.getAutor());
        System.out.println(miLibro.getDescripcion());
        System.out.println(miLibro.calcularPrecio());
    }
}

/*
En este caso, la instancia miLibro de la clase Libro hereda los métodos de acceso de la clase Producto,
redefine el método calcularPrecio() para incluir un descuento del 10% sobre el precio base y agrega
su propio método de acceso getAutor().
 */