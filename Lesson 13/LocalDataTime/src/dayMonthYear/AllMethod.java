package dayMonthYear;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class AllMethod {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2023,01,11);
        System.out.println(date);

        LocalTime date2 = LocalTime.of(16,28);
        System.out.println(date2);

        LocalDateTime date3 = LocalDateTime.of(2023,Month.JANUARY,11,16,29);
        System.out.println(date3);

        LocalDate date4 = LocalDate.now();
        System.out.println(date4.getYear());
        System.out.println(date4.getMonthValue());
        System.out.println(date4.getDayOfMonth());
        System.out.println(date4.getDayOfYear());

        LocalDateTime date5 = LocalDateTime.of(2023,01,11,16,43);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(f1.format(date5));
        System.out.println(f2.format(date5));

        Period annually = Period.ofYears(1);
        System.out.println(annually.getYears());

        LocalDateTime date6 = LocalDateTime.now();
        System.out.println(date6.withNano(0));
    }
}