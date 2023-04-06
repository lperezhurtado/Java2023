public class C007MetodosStrings01 {
    public static void main(String[] args) {

        String dato1 = "Esto es un 'String'";
        //En versiones antiguas: String dato2 = "Esto es un \"String\"";
        System.out.println(dato1);

        //Comparacion de Strings
        String dato3 = "String de prueba";
        String dato4 = new String("String de Prueba");

        System.out.println(dato3 == dato4);                     //Son el mismo objeto?
        System.out.println(dato3.equals(dato4));                //Tienen el mismo valor?
        System.out.println(dato3.equalsIgnoreCase(dato4));      //Mismo valor incluyendo mayúsculas

        //dos formas de encadenar Strings:
        System.out.println("Esto es " + " una frase");

        //Con concat
        String dato5 = "Esto es ";
        String dato6 = " una frase";
        System.out.println(dato5.concat(dato6));

        //StringBuilder. Más eficiente que String
        StringBuilder sb = new StringBuilder(); //Crear stringbuilder
        sb.append("Hola");                      //Añadimos elementos
        sb.append(" ");
        sb.append("mundo");

        sb.insert(5," a ");             //insertamos en una posicion especifica

        sb.delete(6,7);                            //BOrramos una posición especifica
        String resultado = sb.toString();          //Pasamos el StringBuilder a String.
        System.out.println(resultado);
    }
}
