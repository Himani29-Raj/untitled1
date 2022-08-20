import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.of(1991,6,19);
//        LocalDate d2 = d.plus(80, ChronoUnit.YEARS);
//        Period p = Period.between(d,d2);
//        System.out.println(p);
//        System.out.println(p.getDays() + p.getYears()*365 + p.getMonths()*12*30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse("23-03-2019",formatter);
        System.out.println(date);

    }
}
