package zadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        int delta;
        double x1;
        double x2;

        System.out.println("Podaj a");
        a = in.nextInt();
        System.out.println("Podaj b");
        b = in.nextInt();
        System.out.println("Podaj c");
        c = in.nextInt();

        delta = b * b - 4 * a * c;
        System.out.println(delta);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwiastki równania kwadratowego: " + x1 + " oraz " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Jest jeden pierwiastek równania: " + x1);
        } else {
            System.out.println("Delta ujemna");
        }

    }
}
