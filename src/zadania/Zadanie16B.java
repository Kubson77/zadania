package zadania;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadanie16B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        LinkedList list = new LinkedList();
        for (int i = 1; i < 10; i++) {
            System.out.println("Wprowadź liczbę");
            number = scanner.nextInt();
            list.add(number);
        }
        int current;
        int previous = (int) list.get(0);
        int lenght = list.size();
        int finalMaxValue = 1;
        int tempMaxValue = 1;
        for (int i = 1; i < lenght; i++) {
            current = (int) list.get(i);
            if (current > previous) {
                tempMaxValue = tempMaxValue + 1;
            } else {
                if (tempMaxValue > finalMaxValue) {
                    finalMaxValue = tempMaxValue;
                }
                tempMaxValue = 1;
            }
            previous = current;
        }
        System.out.println("Najdłuższy podciąg to : " + finalMaxValue);
    }
}
