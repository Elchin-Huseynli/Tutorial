package dayMonthYear;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class DayMonthYear {
    public static void main(String[] args) {
        System.out.print("Date: ");
        String str = new Scanner(System.in).nextLine();

        String[] strArr = str.split("/");
        int day = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int year = Integer.parseInt(strArr[2]);

        LocalDate date = LocalDate.of(year,month,day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println(formatter.format(date));
        System.out.println("-----------");
        System.out.println("Day: " + date.getDayOfMonth() + "\nMonth: " + date.getMonthValue() + "\nYear: " + date.getYear());

    }
}
