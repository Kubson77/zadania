package zadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float weight;
        int height;
        float BMI;

        System.out.println("Podaj swoją wagę:");
        weight = in.nextFloat();
        System.out.println("Podaj swój wzrost:");
        height = in.nextInt();

        BMI = weight /  ((float) height / 100);

        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }

    }
}
