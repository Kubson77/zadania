package zadania;

import java.util.Scanner;

// Program wyświetla tyle fal (po 4 gwiazdki) ile poda użytkownik
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        char[][] table;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        table = new char[4][number * 4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == 0 && (j % 8 == 0 || j % 8 == 7)) {
                    table[i][j] = '*';
                } else if (i == 1 && (j % 8 == 1 || j % 8 == 6)) {
                    table[i][j] = '*';
                } else if (i == 2 && (j % 8 == 2 || j % 8 == 5)) {
                    table[i][j] = '*';
                } else if (i == 3 && (j % 8 == 3 || j % 8 == 4)) {
                    table[i][j] = '*';
                } else {
                    table[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

}
