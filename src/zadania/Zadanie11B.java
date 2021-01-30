package zadania;

import java.util.InputMismatchException;
import java.util.Scanner;

// Rozwiązanie Seweryna
public class Zadanie11B {
        public static void main(String[] args) {
            String userText;
            String[] userTableText = new String[0];
            do {
                userText = getUserValue("Podaj slowo:");
                if (!"end".equals(userText)) {
                    userTableText = insertToTableString(userText, userTableText);
                }
                printTable(userTableText);
            } while (!"end".equals(userText));
            returnLongestText(userTableText);
        }
        private static void printTable(String[] table) {
            for (String element : table) {
                System.out.println(element);
            }
        }
        private static void returnLongestText(String[] table) {
            String text = "";
            int lenght = -1;
            for (String element: table) {
                if(text.length() < element.length()){
                    text = element.toString();
                }
            }
//        for (int i = 0; i < table.length; i++) {
//            if (i == 0) {
//                lenght = table[i].length();
//                text = table[i];
//            } else if (lenght > table[i].length()) {
//                text = table[i];
//            }
//        }
            System.out.println("Najdluzsze podane slowo to " + text);
        }
        private static String[] insertToTableString(String text, String[] tableString) {
            int lenghtTable = tableString.length + 1;
            String[] newTable = new String[lenghtTable];
            for (int i = 0; i < tableString.length; i++) {
                if (lenghtTable == 1) {
                    newTable[0] = text;
                } else if (1 != lenghtTable) {
                    //             System.out.println(newTable.length + "X" + tableString.length);
                    newTable[i] = tableString[i];
                } else
                    newTable[i] = text;
            }
            return newTable;
        }
        private static String getUserValue(String message) {
            String userValue = "";
            try {
                Scanner in = new Scanner(System.in);
                System.out.println(message);
                userValue = in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Blad podania wartosci: " + e);
                System.exit(999);
            }
            return userValue;
        }
    }

