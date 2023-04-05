import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class C0032Date {
    public static void main(String[] args) {

        //métodos útiles para trabajar con fechas en Java:

        /*
        plusYears(long years) y minusYears(long years): estos métodos permiten agregar o restar
         años a una fecha dada. Por ejemplo:
        */

        LocalDate date = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate futureDate = date.plusYears(5); // 2027-04-03
        LocalDate pastDate = date.minusYears(2); // 2020-04-03

        /*
        plusMonths(long months) y minusMonths(long months): estos métodos permiten agregar o restar
        meses a una fecha dada. Por ejemplo:
         */

        LocalDate date2 = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate futureDate2 = date.plusMonths(3); // 2022-07-03
        LocalDate pastDate2 = date.minusMonths(2); // 2022-02-03

        /*
        plusWeeks(long weeks) y minusWeeks(long weeks): estos métodos permiten agregar o restar
        semanas a una fecha dada. Por ejemplo:
         */

        LocalDate date3 = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate futureDate3 = date.plusWeeks(2); // 2022-04-17
        LocalDate pastDate3 = date.minusWeeks(1); // 2022-03-27

        /*
        plusDays(long days) y minusDays(long days): estos métodos permiten agregar o restar
        días a una fecha dada. Por ejemplo:
        */

        LocalDate date4 = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate futureDate4 = date.plusDays(10); // 2022-04-13
        LocalDate pastDate4 = date.minusDays(5); // 2022-03-29

        /*
        isBefore(ChronoLocalDate otherDate) y isAfter(ChronoLocalDate otherDate):
        estos métodos permiten comparar dos fechas y verificar si una es anterior o
        posterior a la otra. Por ejemplo:
         */

        LocalDate date5 = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate date6 = LocalDate.of(2022, Month.MARCH, 27);
        boolean before = date5.isBefore(date6); // false
        boolean after = date5.isAfter(date6); // true

        /*
        isEqual(ChronoLocalDate otherDate): este método permite comparar dos fechas y
        verificar si son iguales. Por ejemplo:
        */

        LocalDate date7 = LocalDate.of(2022, Month.APRIL, 3);
        LocalDate date8 = LocalDate.of(2022, Month.APRIL, 3);
        boolean equal = date7.isEqual(date8); // true

        /*
        Obtener la fecha actual
        Cómo obtener la fecha actual en Java utilizando la clase java.util.Date.
        Al crear un objeto Date sin ningún parámetro, se establece en la fecha y hora actuales
         */

        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);

        /*
        Comparar fechas
        Cómo comparar fechas en Java utilizando la clase java.util.Calendar.
         */

        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();
        fecha1.set(2022, Calendar.JANUARY, 1);
        fecha2.set(2023, Calendar.APRIL, 5);

        Date date1 = fecha1.getTime();
        Date date2 = fecha2.getTime();

        if (date1.before(date2)) {
            System.out.println("Fecha 1 es anterior a Fecha 2");
        } else if (date1.after(date2)) {
            System.out.println("Fecha 1 es posterior a Fecha 2");
        } else if (date1.equals(date2)) {
            System.out.println("Fecha 1 es igual a Fecha 2");
        }
    }
}

        /*
        En este ejemplo, se utilizó la clase java.util.Calendar para crear dos objetos
        de fecha diferentes. Luego, se comparan las dos fechas utilizando los métodos
        before, after y equals de la clase java.util.Date.
         */