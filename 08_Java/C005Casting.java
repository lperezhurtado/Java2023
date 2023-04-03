public class C005Casting {
    public static void main(String[] args) {
        String dato = "22";

        System.out.println(dato + 10);
        int dato2 = Integer.parseInt(dato);
        System.out.println(dato2 + 10);

        String dato3 = "52345.25";
        double dato4 = Double.parseDouble(dato3);
        System.out.println(dato4 + 10);

        String dato5 = "true";
        int dato6 = 1; //true no es 1, ni false es 0.
        boolean dato7 = Boolean.parseBoolean(dato5);
        if(dato7 == true){
            System.out.println("Sí es un boleano");
        }else {
            System.out.println("No es un boleano");
        }

    //En todos los casos anteriores podríamos haber puesto como tipo de variable "var".

        //Casting de primitivos a String:

        int dato8 = 34;
        String dato9 = String.valueOf(dato8);
        System.out.println(dato9 + 100);

        //Otra forma:
        String dato10 = Integer.toString(dato8);
        System.out.println(dato10 + 100);

        //E igual con las demás clases wrapper; Double, Float...etc:
        String dato11 = Double.toString(dato8);
        System.out.println(dato11 + 100);

        //Casting entre primitivos
        int dato12 = 4223;
        short dato13 = (short) dato12;
        System.out.println(dato13);

        //Cuidado con los desbordamientos de memoria:
        int dato14 = 327663;
        short dato15 = (short) dato14;
        System.out.println(dato15);

        //Cuidado con la perdida de información
        float dato16 = 3.123f;
        int dato17 = (int) dato16;
        System.out.println(dato17); //Muestra un 3, los decimales se pierden.

        //Para los tipos más pequeños no hace falta casting:
        long dato18 = dato14;
        System.out.println(dato18);

        //Cuidado con la perdida de información
        float dato19 = 3.123f;
        int dato20 = (int) dato19;
        System.out.println(dato20); //Muestra un 3, los decimales se pierden.

        //Hay castings imposibles:
        // boolean dato21 = (boolean) dato14;

        // Y otros que sacan lo que quieren
        char dato22 = (char) dato14; //22768
        System.out.println(dato22);




    }
}
