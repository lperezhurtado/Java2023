public class C008StringBuilder {
    public static void main(String[] args) {
// Ejemplo del método append()
        StringBuilder sb = new StringBuilder("Hola ");
        sb.append("mundo"); // Agrega "mundo" al final del contenido de sb
        System.out.println(sb.toString()); // Imprime "Hola mundo"

        // Ejemplo del método insert()
        StringBuilder sb2 = new StringBuilder("Hola mundo");
        sb2.insert(5, ", "); // Inserta ", " en el índice 5 (después de "Hola ")
        System.out.println(sb2.toString()); // Imprime "Hola, mundo"

        // Ejemplo del método delete()
        StringBuilder sb3 = new StringBuilder("Hola mundo");
        sb3.delete(4, 8); // Elimina los caracteres desde el índice 4 hasta el 7
        System.out.println(sb3.toString()); // Imprime "Ho mundo"

        // Ejemplo del método replace()
        StringBuilder sb4 = new StringBuilder("Hola mundo");
        sb4.replace(1, 4, "ip"); // Reemplaza los caracteres desde el índice 1 hasta el 3 con "ip"
        System.out.println(sb4.toString()); // Imprime "Hipto mundo"

        // Ejemplo del método reverse()
        StringBuilder sb5 = new StringBuilder("Hola mundo");
        sb5.reverse(); // Invierte el orden de los caracteres
        System.out.println(sb5.toString()); // Imprime "odnum aloH"

        // Ejemplo del método capacity()
        StringBuilder sb6 = new StringBuilder(10);
        sb6.append("Hola mundo"); // Agrega "Hola mundo" al final del contenido de sb6
        System.out.println(sb6.capacity()); // Imprime 23 (la capacidad actual de sb6)

        // Ejemplo del método length()
        StringBuilder sb7 = new StringBuilder("Hola mundo");
        int longitud = sb7.length(); // Devuelve la longitud del contenido de sb7
        System.out.println("La longitud de \"" + sb7.toString() + "\" es " + longitud);



    }
}
