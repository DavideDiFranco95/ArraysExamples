package DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Dates2 {
    public static void main(String[] args) {

        ZonedDateTime actualDate = ZonedDateTime.now();
        ZoneId mine = ZoneId.of("Europe/Rome");
        ZonedDateTime date2 = actualDate.withZoneSameInstant(mine);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm");

        System.out.println("The First Format is: " + actualDate.format(f1));
        System.out.println("The Second Format is: " + actualDate.format(f2));
    }
}
