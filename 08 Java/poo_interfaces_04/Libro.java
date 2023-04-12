
/*
En este ejemplo, la clase Libro hereda los atributos y métodos de la clase Producto y agrega
un nuevo atributo (autor). Además, redefine el método calcularPrecio() para incluir un descuento
del 10% sobre el precio base y agrega un nuevo método de acceso (getAutor()).

Ahora, podemos crear una instancia de la clase Libro y llamar a cada uno de sus métodos para
verificar que funciona correctamente:
 */

package poo_interfaces_04;


    public class Libro extends Producto {
        private String autor;

        public Libro(String nombre, String descripcion, double precio, String autor) {
            super(nombre, descripcion, precio);
            this.autor = autor;
        }

        public double calcularPrecio() {
            return super.calcularPrecio() * 0.9;
        }

        public String getAutor() {
            return autor;
        }
    }

