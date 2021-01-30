package codeexercise;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String s1 = "abcdabcabcfgabc";
        String s2 = "abcdef";
        String answer;

        answer = findLongestCommonSequence(s1, s2);
        System.out.println("Najdłuższy podciąg: " + answer);

    }

    private static String findLongestCommonSequence(String s1, String s2) {
        String answer = "";
        String current;
        int index;

        for(int length = s1.length(); length > 0; length--) {
            index = 0;
            while(index + length <= s1.length()){
                current = s1.substring(index, index + length);
                if(s2.contains(current)) {
                    answer = current;
                    break;
                }
                index++;
            }
            if(answer.length() != 0) {
                break;
            }
        }

        return answer;
    }
}
