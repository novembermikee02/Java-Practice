package Basics.ArmstrongNumber;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int x = 0;
        while (n > 0) {
            int r = n % 10;
            x = x + (r * r * r);
            n = n / 10;
        }
        if (temp == x) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an Armstrong number.");
        }
    }
}

// Example:
// Enter a number: 153

// Output:
// Armstrong number.

// Explanation:
// In this example, we enter the number 153. The program calculates the sum of
// the cubes of its digits: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. Since the
// result is equal to the original number, the program prints "Armstrong
// number."

// Let's try another example:

// Example:
// Enter a number: 123

// Output:
// Not an Armstrong number.

// Explanation:
// In this example, we enter the number 123. The program calculates the sum of
// the cubes of its digits: 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36. Since the result
// is not equal to the original number (123), the program prints "Not an
// Armstrong number."