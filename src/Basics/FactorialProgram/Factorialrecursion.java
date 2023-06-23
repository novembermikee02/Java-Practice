package Basics.FactorialProgram;

public class Factorialrecursion {
    public static void main(String[] args) {
        int number = 5;
        int factorial = factorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
