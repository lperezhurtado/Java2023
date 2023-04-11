import java.util.*;


public class C036ColeccionesIteradores02 {
    public static void main(String[] args) {

        /*
        Supongamos que tenemos una lista de números enteros y queremos eliminar cualquier
        número que sea par. Podemos hacer esto recorriendo la lista con un iterador y llamando
        al método remove() del iterador para eliminar cualquier número par que encontremos.
         */

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Iterator<Integer> iterador = numeros.iterator();

        while(iterador.hasNext()) {
            Integer numero = iterador.next();
            if(numero % 2 == 0) {
                iterador.remove();
            }
        }

        System.out.println(numeros);





    }
}

