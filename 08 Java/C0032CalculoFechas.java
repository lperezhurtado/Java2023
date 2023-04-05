import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class C0032CalculoFechas {
    public static void main(String[] args) {

        //Usando la clase LocalDate y el método ChronoUnit.DAYS.between:

        LocalDate fecha1 = LocalDate.of(2022, 3, 15);
        LocalDate fecha2 = LocalDate.of(2022, 4, 5);

        long diferenciaEnDias = ChronoUnit.DAYS.between(fecha1, fecha2);

        System.out.println("La diferencia entre " + fecha1 + " y " + fecha2 + " es de " + diferenciaEnDias + " días.");


        //Usando la clase Date y el método getTime:

        Date fecha3 = new Date(2022, 2, 15);
        Date fecha4 = new Date(2022, 3, 5);

        long diferenciaEnTiempo = fecha4.getTime() - fecha3.getTime();
        long diferenciaEnDias2 = TimeUnit.DAYS.convert(diferenciaEnTiempo, TimeUnit.MILLISECONDS);

        System.out.println("La diferencia entre " + fecha3 + " y " + fecha4 + " es de " + diferenciaEnDias2 + " días.");

        //Usando la clase Calendar y el método getTimeInMillis:

        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(2022, 2, 15);

        Calendar fecha6 = Calendar.getInstance();
        fecha6.set(2022, 3, 5);

        long diferenciaEnTiempo3 = fecha6.getTimeInMillis() - fecha5.getTimeInMillis();
        long diferenciaEnDias3 = TimeUnit.DAYS.convert(diferenciaEnTiempo3, TimeUnit.MILLISECONDS);

        System.out.println("La diferencia entre " + fecha5.getTime() + " y " + fecha6.getTime() + " es de " + diferenciaEnDias3 + " días.");

    }
}
