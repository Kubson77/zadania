package codeexercise;

public class PackageRiceBags {
    public static void main(String[] args) {
        int big = 8;
        int small = 4;
        int goal = 34;
        int answer;

        answer = getNumberSmallBags(big, small, goal);
        System.out.println("Minimalna liczba worków wynosi: " + (answer));

    }

    private static int getNumberSmallBags(int big, int small, int goal) {
        int result = -1;
        if (big * 5 >= goal) {
            if (small >= goal % 5)
                result = goal % 5;
        } else {
            if (small >= goal - big * 5) {
                result = goal - big * 5;
            }
        }
        return result;
    }
}
