
/*
Supongamos que tenemos una lista de compras y queremos eliminar los elementos duplicados.
Podríamos crear un HashSet y agregar todos los elementos de la lista a ese HashSet,
lo que eliminará automáticamente los duplicados. Luego, podríamos convertir el HashSet
de nuevo a una lista para obtener la lista de compras sin elementos duplicados.

 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C025ColeccionesHashSet02 {
    public static void main(String[] args) {


        // Creamos una lista con elementos duplicados
        List<String> listaCompras = new ArrayList<>();
        listaCompras.add("Leche");
        listaCompras.add("Queso");
        listaCompras.add("Huevos");
        listaCompras.add("Leche");
        listaCompras.add("Huevos");

        // Creamos un HashSet y agregamos todos los elementos de la lista
        Set<String> conjuntoCompras = new HashSet<>(listaCompras);

        // Convertimos el HashSet de nuevo a una lista para obtener la lista sin elementos duplicados
        List<String> listaComprasSinDuplicados = new ArrayList<>(conjuntoCompras);

        // Imprimimos la lista original y la lista sin elementos duplicados
        System.out.println("Lista original: " + listaCompras);
        System.out.println("Lista sin elementos duplicados: " + listaComprasSinDuplicados);


    }
}

/*
        En este ejemplo, creamos una lista listaCompras con algunos elementos
        duplicados ("Leche" y "Huevos"). Luego, creamos un HashSet llamado conjuntoCompras
        y agregamos todos los elementos de la lista a ese HashSet. Debido a que los HashSet
        no permiten elementos duplicados, el HashSet automáticamente elimina los elementos
        duplicados de la lista.

        Finalmente, convertimos el HashSet de nuevo a una lista llamada listaComprasSinDuplicados,
        que contiene la lista de compras original sin elementos duplicados. Imprimimos tanto
        la lista original como la lista sin elementos duplicados para mostrar que los elementos
        duplicados han sido eliminados.
 */