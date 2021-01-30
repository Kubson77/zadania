package zadania;

//ctrl + alt + m -> tworzenie metody;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Zadanie7file {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = "filename.txt";
        File file1 = new File(fileName);
        BufferedWriter buf1 = null;
        int number;
        long amountOfLines;

        System.out.println("Podaj liczbę całkowitą");
        number = in.nextInt();

        try {
            buf1 = createFile(file1);
        } catch (IOException exc) {
            System.out.println("Błąd, " + exc);
            System.exit(-1);
        }

        amountOfLines = getAmountOfLines(file1);

        if (amountOfLines >= number) {
            try {
                System.out.println(getLineNumber(number - 1, file1));
            } catch (IOException exc) {
                System.out.println("Błąd, " + exc);
                System.exit(-1);
            }
        } else {
            try {
                int first = 0;
                int second = 1;
                if (amountOfLines > 2) {
                    first = getLineNumber((int) amountOfLines - 2, file1);
                    second = getLineNumber((int) amountOfLines - 1, file1);
                }
                sumOfFibonacci(buf1, number, first, second, amountOfLines);
            } catch (IOException exc) {
                System.out.println("Błąd, " + exc);
                System.exit(-1);
            }
        }
    }

    private static int getLineNumber(int number, File file1) throws IOException {
        return Integer.parseInt(Files.readAllLines(file1.toPath()).get(number));
    }

    public static BufferedWriter createFile(File file1) throws IOException {
        file1.createNewFile();
        FileWriter fileWriter1 = new FileWriter(file1, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
        return bufferedWriter;
    }

    public static int sumOfFibonacci(BufferedWriter bufferedWriter, int number, int first, int second, long amountOfLines) {
        int sum = 0;

        try {
            for (long i = amountOfLines; i < number; i++) {
                sum = first + second;
                bufferedWriter.write(String.valueOf(sum));
                bufferedWriter.newLine();
                first = second;
                second = sum;
            }
            System.out.println("Suma wzięta z obliczeń " + sum);
            bufferedWriter.close();
            return sum;
        } catch (IOException e) {
            System.out.println("Błąd, " + e);
        }
        return sum;
    }

    public static long getAmountOfLines(File file1) {
        if (file1.exists()) {
            Path path1 = file1.toPath();
            try {
                return Files.lines(path1).count();
            } catch (IOException e) {
                System.out.println("Błąd, " + e);
            }
        }
        return 0;
    }
}
