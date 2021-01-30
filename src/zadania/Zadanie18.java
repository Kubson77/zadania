package zadania;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        boolean answer;

        System.out.println("Podaj swój tekst:");
        text = in.nextLine();

        answer = sneeze(text);
        if(answer) {
            System.out.println("Na zdrowie!");
        } else {
            System.out.println("-------");
        }

    }
    public static boolean sneeze(String text) {
        boolean answer = false;
        String regexp = ".*a+ psik.*";
        // String regexp = ".*(a+\\s\\bpsik\\b).*" -> to samo co wyżej tylko bardziej rozbudowane
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()) {
            answer = true;
        }
        return answer;
    }

    // metoda nie korzystająca z regex
    public static boolean sneeze2(String text) {
        boolean answer = false;
        Pattern pattern = Pattern.compile("a psik");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find() == true) {
            answer = true;
            System.out.println("znaleziono");
        }
        return answer;
    }
}
