package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Dates1 {
    public static void main(String[] args) {

        /*LocalDate actualDate = LocalDate.now();
        LocalDate endOfMonth = actualDate.withDayOfMonth(actualDate.lengthOfMonth());
        long daysBetween = DAYS.between(actualDate,endOfMonth);

        System.out.println("Days until the end of the Month: " + daysBetween);

        LocalDate endOfYear = actualDate.withDayOfYear(actualDate.lengthOfYear());
        long daysBetweenYear = DAYS.between(actualDate,endOfYear);

        System.out.println("Days until the end of the Year: " + daysBetweenYear);

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la tua data di Nascita in formato dd/MM/yyyy");
        String input = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        try{
            Date dateOfBirth = dateFormat.parse(input);
            System.out.println("La tua data di nascita è: " + dateOfBirth);
        }catch (ParseException e){
            System.out.println("Formato non è valido.");
        }*/

        LocalDateTime localDateTime = LocalDateTime.of(1492, Month.OCTOBER,12,8,26);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
