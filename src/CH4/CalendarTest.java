package CH4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Nauh
 * @version 1.50 2019-05-23
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int toDay = date.getDayOfMonth();
        int month = date.getMonthValue();

        date = date.minusDays(toDay - 1);
        DayOfWeek weekDay = date.getDayOfWeek();

        int value = weekDay.getValue();

        System.out.print("Mon Tue Wed Thu Fri Sat Sun");
        System.out.println();
        for (int i = 0; i < value + 1; i++) {
            System.out.print("  ");
        }
        while (date.getMonthValue() <= month + 1) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == toDay) {
                System.out.print("*");
            } else
                System.out.print(" ");

            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
