package zadania;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;

        System.out.println("Wprowadź swój tekst");
        text = in.nextLine();
        String answer = stutter(text);

        System.out.println("Oryginalny tekst: " + text);
        System.out.println("Tekst po modyfikacji: " + answer);
    }

    public static String stutter(String text) {
        String temp_text = "";
        String answer = "";
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                temp_text += text.charAt(i);
            } else {
                answer += temp_text;
                answer += " ";
                answer += temp_text;
                answer += " ";
                temp_text = "";
            }
        }
        answer += temp_text;
        answer += " ";
        answer += temp_text;
        answer += " ";
        return answer;
    }

}
