package zadania;

import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(101);
        int answer;

       // System.out.println(number);

        do {
            System.out.println("Podaj swoją liczbę");
            answer = in.nextInt();
            if (answer == number) {
                System.out.println("Bingo!");
                break;
            } else if (answer > number) {
                System.out.println("Za dużo");
            } else {
                System.out.println("Za mało");
            }
        } while (true);
    }
}
