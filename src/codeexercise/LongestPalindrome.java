package codeexercise;

import java.util.ArrayList;

public class LongestPalindrome {
    public static void main(String[] args) {
        String text2 = "abcdbdcbf";

        palindrome2(text2);
        System.out.println(solution(text2));
    }

    private static void palindrome2(String text) {
        ArrayList<Character> list = new ArrayList<>();
        int x = (text.length() - 1);
        int counter = 0;
        int palindrome_counter = 0;
        char sign;
        boolean answer;

        for (int i = 0; i < x; i++) {
            sign = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                if (sign == text.charAt(j)) {
                    System.out.println("tutaj " + sign);
                    int a_i = i;
                    int a_j = j;
                    answer = true;
                    for (; a_i < a_j; a_i++) {
                        if (text.charAt(a_i) != text.charAt(a_j)) {
                            answer = false;
                            break;
                        }
                        a_j--;
                        palindrome_counter++;
                    }
                    if (answer && (palindrome_counter > counter)) {
                        list = new ArrayList<>();
                        a_i = i;
                        a_j = j;
                        for (; a_i <= a_j; a_i++) {
                            list.add(text.charAt(a_i));
                        }
                        counter = palindrome_counter;
                    }
                    palindrome_counter = 0;
                }
            }
        }
        if (!list.isEmpty()) {
            System.out.println(list);
        } else {
            System.out.println("Tekst nie zawiera palindromów");
        }
    }

    // Rozwiązanie zadania z neta
    public static String solution(String word) {
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            String current = findLongestPalindromeInternal(word.substring(i));
            if (longestPalindrome.length() < current.length()) {
                longestPalindrome = current;
            }
        }
        return longestPalindrome;
    }

    public static String findLongestPalindromeInternal(String word) {
        String longestPalindrome;

        int index = word.length();
        while (index > 0 && !isPalindrome(word.substring(0, index))) {
            index--;
        }
        longestPalindrome = word.substring(0, index);

        return longestPalindrome;
    }

    public static boolean isPalindrome(String word) {
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

}
