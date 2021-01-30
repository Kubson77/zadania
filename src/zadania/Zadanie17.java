package zadania;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate actualDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String sdaDate;

        System.out.println("Podaj datę najbliższych zajęć (w formacie dd.MM.yyyy):");
        sdaDate = in.nextLine();
        LocalDate dateTime = LocalDate.parse(sdaDate, formatter);

        long daysBetween = ChronoUnit.DAYS.between(actualDate, dateTime);
        System.out.println("Do najbliższych zajęć pozostało: " + daysBetween + " dni");

    }
}
