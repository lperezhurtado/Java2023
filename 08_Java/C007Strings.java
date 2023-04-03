public class C007Strings {
    public static void main(String[] args) {

        //Declaración de Strings:
        String dato1 = "Esto es un String.";
        String dato2 = "Esto es un \"String\"";

        //Comparación de Strings
        //Los Strings no son primitivos, son objetos. Cuidado al compararlos:
        String dato3 = "String de prueba";
        String dato4 = new String("String de PRUEBA");

        System.out.println(dato3 == dato4);                 //Son el mismo objeto?
        System.out.println(dato3.equals(dato4));            //Tienen el mismo valor?
        System.out.println(dato3.equalsIgnoreCase(dato4));  //Tienen el mismo valor ignorando las mayúsculas?

        //Concatenación normal
        System.out.println("Esta es una " + "frase de prueba.");

        //Concatenación con Concat
        String dato5 = "Esta es una ";
        String dato6 = "frase de prueba.";
        System.out.println(dato5.concat(dato6));

        //--------------------------------------
        //StringBuilder
        //--------------------------------------

        /* En Java, la clase StringBuilder se utiliza para crear y manipular cadenas de
        caracteres de manera más eficiente que la clase String. A diferencia de la clase String,
        que es inmutable, la clase StringBuilder es mutable, lo que significa que puede cambiar
        su contenido sin crear un nuevo objeto cada vez.
        Al crear un objeto StringBuilder, se reserva un espacio de memoria para almacenar caracteres y
        se pueden agregar o eliminar caracteres a este espacio de memoria según sea necesario.
        Esto es particularmente útil cuando se trabaja con cadenas grandes o cuando se realiza una
        gran cantidad de manipulación de cadenas.
        */

        StringBuilder sb = new StringBuilder();
        sb.append("Hola"); // Agregar una cadena
        sb.append(" ");
        sb.append("mundo!");
        sb.insert(5, " a "); // Insertar una cadena en una posición determinada
        sb.delete(6, 7); // Eliminar el carácter "a"
        String resultado = sb.toString(); // Convertir StringBuilder a String
        System.out.println(resultado); // Imprimir la cadena resultante: "Hola a mundo!"

        /*
        En este ejemplo, se crea un objeto StringBuilder vacío y se agrega la cadena "Hola"
        y un espacio en blanco utilizando el método append(). Luego, se agrega la
        cadena "mundo!" también usando append(). Después, se inserta la cadena " a " en
        la posición 5 utilizando el método insert(). A continuación, se elimina el
        carácter "a" utilizando el método delete(). Finalmente, se convierte el objeto
        StringBuilder en un objeto String utilizando el método toString() y se imprime en la consola.
        El resultado impreso será "Hola a mundo!".
         */

    }
}
