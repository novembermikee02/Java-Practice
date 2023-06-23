package Basics.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    private static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        String reversedNumberString = new StringBuilder(numberString).reverse().toString();

        if (numberString == reversedNumberString) {
            return true;
        } else {
            return false;
        }
        // return numberString.equals(reversedNumberString);
    }
}

// we convert the input number to a string using String.valueOf(number).
// Then, we use the StringBuilder class to reverse the number string.
// Finally, we compare the original number string with the reversed number
// If they are equal,
// the number is a palindrome.