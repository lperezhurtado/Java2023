
//-----------------------------------------------------
// Declaración e inicialización de una variable de tipo entero
//-----------------------------------------------------


public class C001Basicos {
    public static void main(String[] args) {

        //-----------------------------------------------------
        // Declaración e inicialización de una variable de tipo entero
        //-----------------------------------------------------


        int numero = 5;

        // Declaración de una variable de tipo entero
        int otroNumero;

        // Inicialización de la variable anterior
        otroNumero = 10;

        // Declaración de varias variables de tipo entero en una sola línea
        int a, b, c;

        // Declaración e inicialización de una variable de tipo decimal
        double decimal = 3.14;

        // Declaración e inicialización de una variable de tipo booleano
        boolean verdadero = true;

        // Declaración e inicialización de una variable de tipo cadena
        String mensaje = "Hola mundo!";

        // Declaración e inicialización de una variable de tipo carácter
        char letra = 'a';

        // Declaración e inicialización de una constante de tipo entero
        final int CONSTANTE = 100;

        // Declaración e inicialización de una variable de tipo long
        long largo = 1000000L;

        // Declaración e inicialización de una variable de tipo float
        float flotante = 3.14f;

        // Declaración e inicialización de una variable de tipo short
        short corto = 10;

        // Declaración e inicialización de una variable de tipo byte
        byte byteVariable = 127;

        // Declaración e inicialización de una variable de tipo objeto
        Object objeto = new Object();

        // Declaración e inicialización de una variable de tipo array
        int[] arreglo = {1, 2, 3, 4, 5};

        // Declaración de una variable de tipo array
        int[] otroArreglo;

        // Inicialización del arreglo anterior
        otroArreglo = new int[10];


        //-----------------------------------------------------
        //-----------------------------------------------------
        byte valor1 = 1;
        System.out.println("El tipo byte usa " + Byte.BYTES + " bytes.");
        System.out.println("El tipo byte usa " + Byte.SIZE + " bites.");
        System.out.println("El valor máximo de byte es " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de byte es " + Byte.MIN_VALUE);

        short valor2 = 1;
        System.out.println("El tipo short usa " + Short.BYTES + " bytes.");
        System.out.println("El tipo short usa " + Short.SIZE + " bites.");
        System.out.println("El valor máximo de short es " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de short es " + Short.MIN_VALUE);

        int valor3 = 1;
        System.out.println("El tipo int usa " + Integer.BYTES + " bytes.");
        System.out.println("El tipo int usa " + Integer.SIZE + " bites.");
        System.out.println("El valor máximo de int es " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de int es " + Integer.MIN_VALUE);

        long valor4 = 1;
        System.out.println("El tipo long usa " + Long.BYTES + " bytes.");
        System.out.println("El tipo long usa " + Long.SIZE + " bites.");
        System.out.println("El valor máximo de long es " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de long es " + Long.MIN_VALUE);

        float valor5 = 1;
        System.out.println("El tipo float usa " + Float.BYTES + " bytes.");
        System.out.println("El tipo float usa " + Float.SIZE + " bites.");
        System.out.println("El valor máximo de float es " + Float.MAX_VALUE);
        System.out.println("El valor mínimo de float es " + Float.MIN_VALUE);

        double valor6 = 1;
        System.out.println("El tipo double usa " + Double.BYTES + " bytes.");
        System.out.println("El tipo double usa " + Double.SIZE + " bites.");
        System.out.println("El valor máximo de double es " + Double.MAX_VALUE);
        System.out.println("El valor mínimo de double es " + Double.MIN_VALUE);

        char valor7 = 1;
        System.out.println("El tipo char usa " + Character.BYTES + " bytes.");
        System.out.println("El tipo char usa " + Character.SIZE + " bites.");
        System.out.println("El valor máximo de char es " + Character.MAX_VALUE);
        System.out.println("El valor mínimo de char es " + Character.MIN_VALUE);


        //-----------------------------------------------------
        //Caracteres Unicode:
        //-----------------------------------------------------
        char valor9 = '@';
        char valor10 = '\u0040';
        System.out.println(valor9 == valor10);

        //-----------------------------------------------------
        //Caracteres Unicode especiales:
        //-----------------------------------------------------

        char valor11 = '\u0020'; //Caracter espacio.
        char valor12 = '\b';
        char valor13 = '\n';
        char valor14 = '\r';
        char valor15 = '\t';

        System.out.println("Ejemplo de uso de carácter especial espacio: " + valor11 + ".");
        System.out.println("Ejemplo de uso de carácter retroceso: " + valor12 + ".");
        System.out.println("Ejemplo de uso de carácter nueva línea: " + valor13 + "Esto está en una nueva línea.");
        System.out.println("Ejemplo de uso de carácter retorno de carro: " + valor14 + ".");
        System.out.println("Ejemplo de uso de carácter tabulador: " + valor15 + "espacio después de tabulado.");

    }
}
