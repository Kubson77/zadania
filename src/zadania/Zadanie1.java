package zadania;

import java.util.Scanner;

import static java.lang.Math.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float diameter;
        float pi = 3.14f;
        float circuit;

        System.out.println("Podaj średnicę koła:");
        diameter = in.nextFloat();
        circuit = pi * diameter;
        System.out.println("Obwód koła o średnicy: " + diameter + " wynosi: " + circuit);

        circuit = (float) PI * diameter;
        System.out.println("Obwód koła o średnicy: " + diameter + " wynosi: " + circuit);
    }
}
