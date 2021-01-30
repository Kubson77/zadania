package zadania;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        double answer;

        System.out.println("Podaj swój tekst:");
        String text = in.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println("Liczba spacji w tekscie: " + counter);
        answer = (double) counter / text.length() * 100;
        System.out.printf("Liczba spacji w tekscie wynosi %.2f%s", answer,"%");
    }

}
