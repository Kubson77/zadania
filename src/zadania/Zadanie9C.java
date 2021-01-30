package zadania;

import java.util.Scanner;


// Rozwiązanie Tomka
public class Zadanie9C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        version2(number);
    }
    public static void version2(int number) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < number; i++) {
                if ((i - j) % 8 == 0 || (i + j + 1) % 8 == 0) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
