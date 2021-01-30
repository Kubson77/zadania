package codeexercise;

import java.util.ArrayList;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        int number = 455;
        int max;

        max = largestPrimeFactor2(number);
        System.out.println("Maxymalna wartość wynosi: " + max);
    }

    private static int largestPrimeFactor(int number) {
        int answer = 0;
        int temp_number = number;
        int i = 2;
        ArrayList<Integer> factors = new ArrayList<>();

        while (temp_number > 1) {
            if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0) || i == 2 || i == 3 || i == 5) {
                if (temp_number % i == 0) {
                    temp_number /= i;
                    factors.add(i);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int x : factors) {
            answer = Math.max(answer, x);
            System.out.println(x);
        }
        return answer;
    }

    // rozwiązanie z neta
    private static int largestPrimeFactor2(int number) {
        int factor = -1;

        for (int i = 2; i * i <= number; i++) {
            System.out.println(i);
            if (number == 1) {
                break;
            }
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}
