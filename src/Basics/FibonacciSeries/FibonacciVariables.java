package Basics.FibonacciSeries;

import java.util.Scanner;

public class FibonacciVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;

        sc.close();
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
