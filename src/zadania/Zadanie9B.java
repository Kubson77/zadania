package zadania;

import java.util.Scanner;

// Program wyświetla tyle gwiazdek ile poda użytkownik
public class Zadanie9B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int temp_number;
        char[][] table;
        int first = 0;
        int second = 3;
        int pos = 0;

        System.out.println("Podaj liczbę całkowitą");
        temp_number = number = in.nextInt();

        table = new char[4][number];

        while (temp_number > 0) {
            while (temp_number > 0) {
                if (first < 4) {
                    table[first++][pos++] = '*';
                } else {
                    first = 0;
                    break;
                }
                temp_number--;
            }

            while (temp_number > 0) {
                if (second >= 0) {
                    table[second--][pos++] = '*';
                } else {
                    second = 3;
                    break;
                }
                temp_number--;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] != '*') table[i][j] = ' ';
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
