package Basics.ArmstrongNumber;

import java.util.Scanner;

public class armstrongNumberWithStartAndEndLimit {
    public static void main(String[] args) {
        System.out.println("Enter the lower limit: ");
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();

        System.out.println("Enter the upper limit: ");
        int upperLimit = sc.nextInt();

        System.out.println("Armstrong numbers within the given range:");
        for (int number = lowerLimit; number <= upperLimit; number++) {
            int temp = number;
            int result = 0;

            // Calculate the sum of cubes of digits
            while (temp > 0) {
                int digit = temp % 10;
                result += Math.pow(digit, 3);
                temp /= 10;
            }

            // Check if the number is an Armstrong number
            if (number == result) {
                System.out.println(number);
            }
        }
    }
}

// Example Run:
// Enter the lower limit: 100
// Enter the upper limit: 1000

// Armstrong numbers within the given range:
// 153
// 370
// 371
// 407