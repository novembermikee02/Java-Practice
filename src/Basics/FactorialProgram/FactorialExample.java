package Basics.FactorialProgram;

public class FactorialExample {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        // Using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
