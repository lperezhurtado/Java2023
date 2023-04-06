



public class C0037Enums {
    public static void main(String[] args) {

        //Sintaxis de un enumerado
        enum NombreEnum {
            CONSTANTE1,
            CONSTANTE2,
            CONSTANTE3,
            // ...
        }

        /*
        Cada constante en el enum es un objeto único de la clase enum.
        Por lo tanto, es posible agregar atributos y métodos a cada constante.
        */

        //Declaración de un enumerado
        enum DiaSemana {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO;

            public boolean esDiaHabil() {
                return this != SABADO && this != DOMINGO;
            }
        }

        /*
        En este ejemplo, se define un enum llamado DiaSemana con siete constantes
        correspondientes a los días de la semana.
        El método esDiaHabil se define en la clase enum y se puede llamar en cualquiera
        de las constantes para verificar si es un día hábil.
        */

        /*
        Acceso a los valores del enum.
        Para acceder a los valores de un enum, se puede usar el nombre del enum seguido
        del nombre de la constante:
         */

        DiaSemana dia = DiaSemana.MARTES;
        System.out.println(dia); // Imprime "MARTES"

        /*
        También es posible usar el método values() para obtener un array de todas las constantes en el enum:
        */

        DiaSemana[] dias = DiaSemana.values();
        for (DiaSemana dia3 : dias) {
            System.out.println(dia3);
        }
        // Imprime:
        // LUNES
        // MARTES
        // MIERCOLES
        // JUEVES
        // VIERNES
        // SABADO
        // DOMINGO

        /*
        Comparación de enums
        Los objetos enum se pueden comparar con el operador == porque cada constante es
        un objeto único. También se puede usar el método equals() para comparar constantes:
         */

        DiaSemana dia1 = DiaSemana.MARTES;
        DiaSemana dia2 = DiaSemana.MARTES;
        System.out.println(dia1 == dia2); // Imprime "true"
        System.out.println(dia1.equals(dia2)); // Imprime "true"
    }
}

