package StringsHashingAndBitManipulation;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];   // Array to store frequency of characters

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Display frequency
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}

