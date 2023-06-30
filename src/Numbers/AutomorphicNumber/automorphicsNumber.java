package Numbers.AutomorphicNumber;

import java.util.Scanner;

public class automorphicsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int divisor = 1;
        int temp = number;

        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }

        if (square % divisor == number) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }
}
