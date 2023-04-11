import java.util.*;


public class C036ColeccionesIteradores {
    public static void main(String[] args) {

        //Iterador sobre lista:
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!");

        Iterator<String> iterador = lista.iterator();

        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }


        //Iterador sobre Set
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        Iterator<Integer> iterador2 = conjunto.iterator();

        while(iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }


        //Iterador sobre Map
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);

        Iterator<Map.Entry<String, Integer>> iterador3 = mapa.entrySet().iterator();

        while(iterador3.hasNext()) {
            Map.Entry<String, Integer> entry = iterador3.next();
            System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
        }

    }
}

