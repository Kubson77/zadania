package zadania;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        for (int i = 2; i < number; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            } else if (i == 2 || i == 3 || i == 5) {
                System.out.println(i);
            }
        }
    }
}
