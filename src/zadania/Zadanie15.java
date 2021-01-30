package zadania;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] table = new int[10];
        int[] answer;

        for (int i = 0; i < table.length; i++) {
            System.out.println("Wprowadź liczbę nr. " + (i + 1));
            table[i] = in.nextInt();
        }

        answer = minTwice(table);
        System.out.println("Liczby które wystąpiły co najmniej dwukrotnie:");
        for (int x : answer) {
            if (x != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static int[] minTwice(int[] table) {
        int[] answer = new int[table.length];
        int counter = 0;
        boolean check = true;
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] == table[j]) {
                    for(int x: answer) {
                        if(table[i] == x) {
                            check = false;
                            break;
                        }
                    }
                    if(check) {
                        answer[counter++] = table[i];
                        break;
                    }
                    check = true;
                }
            }
        }
        return answer;
    }
}
