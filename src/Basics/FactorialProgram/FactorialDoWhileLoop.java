package Basics.FactorialProgram;

public class FactorialDoWhileLoop {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
