package zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        float answer;

        try {
            answer = calculator();
            System.out.println("Wynik tej operacji wynosi: " + answer);
        } catch (InputMismatchException exc) {
            System.out.println();
        } catch (ArithmeticException exc) {
            System.out.println("Błąd");
        }

    }

    public static float calculator() throws ArithmeticException, InputMismatchException {
        Scanner in = new Scanner(System.in);
        char operator;
        float first;
        float second;
        float answer;

        System.out.println("Podaj liczbę:");
        first = in.nextFloat();
        System.out.println("Podaj znak:");
        operator = in.next().charAt(0);
        System.out.println("Podaj liczbę:");
        second = in.nextFloat();

        switch (operator) {
            case '+':
                answer = first + second;
                break;
            case '-':
                answer = first - second;
                break;
            case '/':
                if(second == 0) throw new ArithmeticException();
                answer = first / second;
                break;
            case '*':
                answer = first * second;
                break;
            default:
                System.out.println("Błędny znak");
                throw new InputMismatchException();
        }
        return answer;
    }
}
