package Basics.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberTwoVariations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();
        System.out.print("Arithmetic Operations: ");
        if (isPalindromeArithmeticOperations(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        System.out.print("Number To String: ");
        if (isPalindromeNumberToString(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    private static boolean isPalindromeArithmeticOperations(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    private static boolean isPalindromeNumberToString(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

// Overview. String valueOf() method is present in String class of java. lang
// package. valueOf() in Java is used to convert any non String variable or
// Object such as int, double, char, and others to a newly created String
// object.
