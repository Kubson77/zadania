package zadania;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] table = new int[10];
        int answer;

        for (int i = 0; i < table.length; i++) {
            System.out.println("Wprowadź liczbę nr. " + (i + 1));
            table[i] = in.nextInt();
        }

        answer = longestSeqOfNum(table);
        System.out.println("Długość najdłuższego ciągu rosnącego: " + answer);

    }

    public static int longestSeqOfNum(int[] table) {
        int counter = 1;
        int answer = 1;

        for (int i = 0; i < table.length - 1; i++) {
            if (table[i] < table[i + 1]) {
                counter++;
                if (counter > answer) answer = counter;
            } else {
                counter = 1;
            }
        }
        return answer;
    }
}
