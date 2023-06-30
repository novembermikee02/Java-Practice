package Numbers.AutomorphicNumber;

import java.util.Scanner;

public class automorphicNumberwithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numberStr)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }
}

// Explanation:

// Read the input number from the user.
// Calculate the square of the number.
// Convert the number and its square to strings using the valueOf() method.
// Use the endsWith() method to check if the square number ends with the
// original number.
// Print the appropriate message based on the result.