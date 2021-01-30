package zadania;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        String temp_text = "";

        do {
            System.out.println("Podaj swój tekst:");
            text = in.nextLine();

            if (text.equalsIgnoreCase("Starczy")) {
                break;
            }

            if (text.length() > temp_text.length()) {
                temp_text = text;
            }
        } while (true);

        if (temp_text.length() > 0) {
            System.out.println("Najdłużysz wprowadzony tekst to: " + temp_text);
        } else {
            System.out.println("Nie podano żadnego tekstu");
        }
    }
}
