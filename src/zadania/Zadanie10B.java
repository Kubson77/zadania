package zadania;

import java.util.Scanner;

public class Zadanie10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        char[] table;
        int digit;
        int sum = 0;

        while (true) {
            boolean check = true;
            System.out.println("Podaj całkowitą liczbę dodatnią");
            answer = in.next();
            table = new char[answer.length()];

            for (int i = 0; i < table.length; i++) {
                table[i] = answer.charAt(i);
                digit = Character.getNumericValue(table[i]);
                if (digit < 0 || digit > 9) {
                    System.out.println("Nie podałeś liczby dodatniej");
                    sum = 0;
                    check = false;
                    break;
                }
                sum += digit;
            }
            if (check) break;
        }

        System.out.println("suma cyfr liczby: " + answer + " wynosi " + sum);

    }
}
