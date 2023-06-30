package Basics.ArmstrongNumber;

import java.util.Scanner;

public class armstrongNumberWithLimit {
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int number = 1; number <= limit; number++) {
            int temp = number;
            int numDigits = String.valueOf(number).length();
            int x = 0;
            while (temp > 0) {
                int r = temp % 10;
                x += power(r, numDigits);
                temp = temp / 10;
            }
            if (number == x) {
                System.out.println(number);
            }
        }
    }

    // Calculate the power of a number without using Math.pow()
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

// Enter the limit:
// 100
// Armstrong numbers up to 100:
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9