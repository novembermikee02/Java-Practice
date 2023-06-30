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

// in the while loop the condition is checked prior to executing any statements
// whereas in the case of do while loop, statements are run at least once, and
// then the condition is verified