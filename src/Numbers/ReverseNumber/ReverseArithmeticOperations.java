package Numbers.ReverseNumber;

public class ReverseArithmeticOperations {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}

// Explanation:

// Initialize the number variable with the number you want to reverse (in this
// case, 12345).
// Initialize the reversedNumber variable as 0. This variable will store the
// reversed number.
// Using a while loop, iterate until the number becomes 0.
// Inside the loop, find the remainder by performing number % 10. This gives you
// the last digit of the number.
// Multiply the reversedNumber by 10 and add the remainder to it.
// Divide the number by 10 to remove the last digit.
// Repeat the above steps until the number becomes 0.
// Finally, the reversedNumber will contain the reversed number.