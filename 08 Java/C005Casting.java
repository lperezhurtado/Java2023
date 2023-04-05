public class C005Casting {
    public static void main(String[] args) {

        String dato = "22";


        System.out.println(dato + 10);
        int dato2 = Integer.parseInt(dato);
        System.out.println(dato2 + 10);

        System.out.println(dato + 10);
        double dato3 = Double.parseDouble(dato);
        System.out.println(dato3 + 10);

        String dato4 = "true";
        boolean dato5 = Boolean.parseBoolean(dato4);

        if(dato5){
            System.out.println("Sí es un boolean");
        }else{
            System.out.println("No es un boolean");
        }

       //Casting entre primitivos

        //Ejemplo desb. de mem
        int dato6 = 327663;
        short dato7 = (short)dato6;
        System.out.println(dato7);

        //Pérdida de información
        float dato8 = 3.123f;
        int dato9 = (int)dato8;
        System.out.println(dato9);

        //Para los tipos más pequeños no hace falta
        long dato10 = dato6;
        System.out.println(dato10);

        //Casting imposibles
        // boolean dato11 = (boolean) dato8;

        //Hay casting sin sentido.
        char dato12 = (char) 22768;
        System.out.println(dato12);




    }
}
