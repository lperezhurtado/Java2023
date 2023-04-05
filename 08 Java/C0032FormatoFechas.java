import java.text.SimpleDateFormat;
import java.util.Date;

public class C0032FormatoFechas {
    public static void main(String[] args) {

        //Ejemplo 1:

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);

        /*
        Explicación: En este ejemplo se utiliza la clase SimpleDateFormat para formatear
        una fecha en el formato "dd/MM/yyyy". Se crea un objeto Date con la fecha actual
        y luego se crea un objeto SimpleDateFormat con el formato deseado.
        Finalmente, se utiliza el método format() de la clase SimpleDateFormat para
        formatear la fecha y se guarda en una cadena de caracteres (String)
        que se imprime por pantalla.
        */

        //-----------------------------------------------------
        //Ejemplo 2:
        //-----------------------------------------------------

        // Formatear fecha en formato "yyyy-MM-dd HH:mm:ss":

        Date fecha2 = new Date();
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada2 = formatoFecha2.format(fecha2);
        System.out.println("Fecha formateada: " + fechaFormateada2);

        /*
        Explicación: En este ejemplo se utiliza la clase SimpleDateFormat para formatear
        una fecha en el formato "yyyy-MM-dd HH:mm:ss".
        Se crea un objeto Date con la fecha actual y luego se crea un objeto SimpleDateFormat
        con el formato deseado.
        Finalmente, se utiliza el método format() de la clase SimpleDateFormat para formatear
        la fecha y se guarda en una cadena de caracteres (String) que se imprime por pantalla.
         */

        //-----------------------------------------------------
        //Ejemplo 3:
        //-----------------------------------------------------

        // Formatear fecha en formato "EEE, dd MMM yyyy HH:mm:ss z"

        Date fecha3 = new Date();
        SimpleDateFormat formatoFecha3 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
        String fechaFormateada3 = formatoFecha3.format(fecha3);
        System.out.println("Fecha formateada: " + fechaFormateada3);

        /*
        Explicación: En este ejemplo se utiliza la clase SimpleDateFormat para formatear
        una fecha en el formato "EEE, dd MMM yyyy HH:mm:ss z".
        Se crea un objeto Date con la fecha actual y luego se crea un objeto SimpleDateFormat
        con el formato deseado.
        Este formato incluye el día de la semana abreviado en tres letras (EEE), el día del
        mes (dd), el mes abreviado en tres letras (MMM), el año (yyyy), la hora en formato
        de 24 horas (HH), los minutos (mm), los segundos (ss) y la zona horaria (z).
        Finalmente, se utiliza el método format() de la clase SimpleDateFormat para formatear
        la fecha y se guarda en una cadena de caracteres (String) que se imprime por pantalla.
         */
    }
}
