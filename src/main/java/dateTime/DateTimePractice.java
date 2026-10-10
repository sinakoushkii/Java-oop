package dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimePractice {

    public static void showDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }

    public static void showTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }

    public static void showDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    public static void showTimeStamp() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
