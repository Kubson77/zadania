package zadania;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.Scanner;

public class Zadanie12B {
    public static void main(String[] args) {
        LocalTime actualTime;
        Scanner in = new Scanner(System.in);
        char sign = 'a';
        long counter = 0;
        int sign_counter = 0;
        String fileName = "source.txt";
        File file1 = new File(fileName);

        System.out.println("Podaj znak którego wystąpienie chcesz sprawdzić:");
        // sign = in.next().charAt(0);

        actualTime = LocalTime.now();
        System.out.println("Czas rozpoczęcia: " + actualTime);
        try {
            FileReader fileReader = new FileReader(fileName);
            System.out.println("Długośc pliku " + file1.length());
            Path path1 = file1.toPath();
            System.out.println("Ilośc linii: " + Files.lines(path1).count());

            for (int i = 0; i < file1.length(); i++) {
                if (fileReader.read() == sign) {
                    sign_counter++;
                }
            }
            counter = file1.length() - 2 * Files.lines(path1).count();
        } catch (FileNotFoundException exc) {
            System.out.println("Nie zanaleziono pliku");
            System.exit(-1);
        } catch (IOException exc) {
            System.out.println("Błąd");
            System.exit(-1);
        }

        System.out.println("Plik zawiera: " + counter + " znaków");
        System.out.println("W tym: " + sign_counter + " znaków typu: " + sign);
        actualTime = LocalTime.now();
        System.out.println("Czas zakończenia: " + actualTime);

    }
}

//    Modyfikacja pętli for:
//    temp_sign = (char) fileReader.read(); -> na początku programu trzeba zainicjalizować zmienną temp_sign !!!
//    if (temp_sign == sign) {
//         sign_counter++;
//         counter++;
//    } else if (temp_sign != '\n' && temp_sign != '\r') {
//         counter++;
//    }
//      Dodatkowo wywalić linię: counter = file1.length() - 2 * Files.lines(path1).count(); -> nie jest potrzebna w powyższym przykładzie

//    Dane przed modyfikacją:
//    Długośc pliku 1046430
//    Ilośc linii: 10010
//    Czas rozpoczęcia: 19:35:26.486298700
//    Plik zawiera: 1026410 znaków
//    W tym: 69300 znaków typu: a
//    Czas zakończenia: 19:36:00.920477

//    Dane po modyfikacji:
//    Czas rozpoczęcia: 19:39:50.917021800
//    Długośc pliku 1046430
//    Ilośc linii: 10010
//    Plik zawiera: 1026410 znaków
//    W tym: 69300 znaków typu: a
//    Czas zakończenia: 19:40:25.436038900

