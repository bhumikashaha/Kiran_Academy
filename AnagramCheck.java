package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();
    
        word1 = word1.replaceAll("\\s+", "").toLowerCase();
        word2 = word2.replaceAll("\\s+", "").toLowerCase();

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The words are Anagrams");
        }
        else {
            System.out.println("The words are Not Anagrams");
        }

        sc.close();
    }
}
