package Basics.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
