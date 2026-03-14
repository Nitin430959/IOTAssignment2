package RecursionAndBackTracking;

import java.util.Scanner;

public class PrintNumbersRecursion {
    static void printNumbers(int n) {
        if (n == 0) {   // Base case
            return;
        }

        printNumbers(n - 1);   // Recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}


