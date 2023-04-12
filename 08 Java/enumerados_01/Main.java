
/*
Supongamos que estamos desarrollando un sistema para un restaurante que tiene diferentes
opciones de menú para el desayuno, el almuerzo y la cena. Cada opción de menú tiene un nombre,
una descripción y un precio.

Para implementar la lógica de nuestro sistema de restaurantes, podemos utilizar enumerados en
Java para definir los diferentes tipos de opciones de menú que ofrecemos:
 */

package enumerados_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<OpcionMenu> opcionesMenu = new ArrayList<>();
        opcionesMenu.add(new OpcionMenu("Huevos revueltos", "Huevos revueltos con tocino y pan tostado", 8.99, TipoMenu.DESAYUNO));
        opcionesMenu.add(new OpcionMenu("Sopa de pollo", "Sopa de pollo con verduras y arroz", 12.99, TipoMenu.ALMUERZO));
        opcionesMenu.add(new OpcionMenu("Bistec con papas fritas", "Bistec a la parrilla con papas fritas y ensalada", 24.99, TipoMenu.CENA));

        /*
        utilizamos un bucle for para recorrer la lista de opciones de menú y acceder a los atributos
        de cada opción a través de sus correspondientes métodos de acceso.
        Luego, mostramos la información de cada opción en la salida estándar utilizando el método
        System.out.println().
         */

        for (OpcionMenu opcion : opcionesMenu) {
            System.out.println(opcion.getNombre() + " - " + opcion.getDescripcion() + " - " + opcion.getPrecio() + " - " + opcion.getTipoMenu().getNombre());
        }
    }
}


/*
En resumen, en este ejemplo utilizamos un enumerado en Java para definir los diferentes tipos
de opciones de menú que ofrecemos en nuestro sistema de restaurantes. Luego, utilizamos una
clase OpcionMenu para definir cada opción de menú, utilizando el enumerado TipoMenu para indicar
a qué tipo de menú pertenece cada opción. Finalmente, creamos una lista de opciones de menú,
las agregamos a la lista y las recorrimos para mostrar su información en la salida estándar.
 */