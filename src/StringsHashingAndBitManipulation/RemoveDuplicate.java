package StringsHashingAndBitManipulation;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        String result = "";
        for (char c : set) {
            result += c;
        }

        System.out.println("Original String: " + str);
        System.out.println("After removing duplicates: " + result);
    }
}

