
public class C0038Enums02 {

        public class EjemploEnum {
            public static void main(String[] args) {

                // Accediendo a los valores del enum
                Mes[] meses = Mes.values();
                for (Mes mes : meses) {
                    System.out.println(mes);
                }


                // Comparando enums
                Mes mes1 = Mes.FEBRERO;
                Mes mes2 = Mes.FEBRERO;
                System.out.println(mes1 == mes2); // Imprime "true"
                System.out.println(mes1.equals(mes2)); // Imprime "true"

                Mes mes3 = Mes.MAYO;
                System.out.println(mes1.compareTo(mes3)); // Imprime "-2" (FEBRERO < MAYO)

                // Accediendo al nombre y ordinal de una constante
                System.out.println(mes1.name()); // Imprime "FEBRERO"
                System.out.println(mes1.ordinal()); // Imprime "1"

                // Accediendo a una constante por su nombre
                String nombre = "MARZO";
                Mes mes4 = Mes.valueOf(nombre);
                System.out.println(mes4); // Imprime "MARZO"
            }
        }

    enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE;
    }
    }


