package zadania;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int index = 1;
        int sum = 0;
        int first = 0;
        int second = 1;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        for (long i = 1; i < number; i++) {
            sum = first + second;
            first = second;
            second = sum;
            index++;
        }

        if (number > 1) {
            System.out.println("Element o indeksie: " + index + " ma wartość: " + sum);
        } else if (number == 1) {
            System.out.println("Element ma wartość 1");
        } else if (number == 0) {
            System.out.println("Element ma wartość 0");
        } else {
            System.out.println("Nieprawidłowa wartość");
        }
    }

}
