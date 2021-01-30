package zadania;

public class Zadanie7rec {
    public static void main(String[] args) {
        int index = 5;
        int number;
        number = meth1(index);

        System.out.println(number);
    }

    public static int meth1(int index) {
        if (index <= 1) {
            return index;
        } else {
            //System.out.println("Index: "  + index + " suma " + (meth1(index - 2) + meth1(index - 1)));
            return meth1(index - 2) + meth1(index - 1);
        }

    }
}
