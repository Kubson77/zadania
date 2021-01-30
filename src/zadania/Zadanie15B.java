package zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie15B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int digit;
        for (int i = 0; i< 10; i++){
            digit = in.nextInt();
            if (myMap.get(digit) == null){
                myMap.put(digit,1);
           }
           else {
                myMap.put(digit, myMap.get(digit) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : myMap.entrySet())
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
    }
}

