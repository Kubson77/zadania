package zadania;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char first;
        char second;
        int answer;

        System.out.println("Podaj pierwszy znak:");
        first = in.next().charAt(0);
        System.out.println("Podaj drugi znak:");
        second = in.next().charAt(0);

        answer = howManyChars(first, second);
        System.out.printf("Pomiędzy znakiem %c oraz %c jest %d znaków ", first, second, answer);

    }

    public static int howManyChars(char first, char second) {
        int counter = 0;
        if (first < second) {
            for (char i = ++first; i < second; i++) {
                counter++;
            }
        } else if (first > second) {
            for (char i = ++second; i < first; i++) {
                counter++;
            }
        }
        return counter;
    }
}
