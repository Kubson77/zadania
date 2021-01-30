package zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zaddanie10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int temp_number;
        int sum = 0;
        int digit;

        while (true) {
            try {
                System.out.println("Podaj całkowitą liczbę dodatnią");
                temp_number = number = in.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Podaj liczbę większą od zera");
                }
            } catch (InputMismatchException exc) {
                System.out.println("Błąd: " + exc);
            }
        }

        while (temp_number > 0) {
            digit = temp_number % 10;
            sum += digit;
            temp_number /= 10;
        }

        System.out.println("suma cyfr liczby: " + number + " wynosi " + sum);

    }
}
