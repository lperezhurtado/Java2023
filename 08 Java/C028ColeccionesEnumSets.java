import java.util.EnumSet;

public class C028ColeccionesEnumSets {
    public static void main(String[] args) {

        // Enumeración que representa los días de la semana
        enum DiaSemana {
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }


            // Ejemplo del método allOf()
            EnumSet<DiaSemana> set1 = EnumSet.allOf(DiaSemana.class);
            System.out.println(set1.toString()); // Imprime todos los elementos de la enumeración

            // Ejemplo del método noneOf()
            EnumSet<DiaSemana> set2 = EnumSet.noneOf(DiaSemana.class);
            System.out.println(set2.toString()); // Imprime []

            // Ejemplo del método of()
            EnumSet<DiaSemana> set3 = EnumSet.of(DiaSemana.LUNES, DiaSemana.MIERCOLES, DiaSemana.VIERNES);
            System.out.println(set3.toString()); // Imprime [LUNES, MIERCOLES, VIERNES]

            // Ejemplo del método add()
            EnumSet<DiaSemana> set4 = EnumSet.of(DiaSemana.LUNES, DiaSemana.MARTES);
            set4.add(DiaSemana.MIERCOLES); // Agrega un elemento al set
            System.out.println(set4.toString()); // Imprime [LUNES, MARTES, MIERCOLES]

            // Ejemplo del método remove()
            EnumSet<DiaSemana> set5 = EnumSet.allOf(DiaSemana.class);
            set5.remove(DiaSemana.SABADO); // Elimina un elemento del set
            System.out.println(set5.toString()); // Imprime todos los elementos excepto SABADO

            // Ejemplo del método size()
            EnumSet<DiaSemana> set6 = EnumSet.allOf(DiaSemana.class);
            int tamano = set6.size(); // Devuelve la cantidad de elementos en el set
            System.out.println("El set tiene " + tamano + " elementos.");

            // Ejemplo del método clear()
            EnumSet<DiaSemana> set7 = EnumSet.allOf(DiaSemana.class);
            set7.clear(); // Elimina todos los elementos del set
            System.out.println(set7.toString()); // Imprime []

            // Ejemplo del método contains()
            EnumSet<DiaSemana> set8 = EnumSet.allOf(DiaSemana.class);
            boolean contiene = set8.contains(DiaSemana.SABADO); // Devuelve true si el set contiene el elemento
            System.out.println("¿Contiene SABADO? " + contiene); // Imprime "¿Contiene SABADO? true"

            // Ejemplo del método complementOf()
            EnumSet<DiaSemana> set9 = EnumSet.of(DiaSemana.LUNES, DiaSemana.MARTES);
            EnumSet<DiaSemana> complemento = EnumSet.complementOf(set9); // Devuelve un set con los elementos que no están en el set dado
            System.out.println(complemento.toString()); // Imprime [MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO]


        }
}

