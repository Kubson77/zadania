package zadania;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        double temp;
        double sum = 0;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            temp = 1 / (double) i;
            sum += temp;
        }
        System.out.println("Suma odwrotności elementów wynosi: " + sum);
    }
}
