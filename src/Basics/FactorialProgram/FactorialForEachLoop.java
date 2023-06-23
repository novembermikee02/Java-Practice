package Basics.FactorialProgram;

public class FactorialForEachLoop {
    public static void main(String[] args) {
        int number = 5;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int factorial = 1;

        for (int num : numbers) {
            factorial *= num;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
