package Basics.FibonacciSeries;

//includes some variations
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci Series:");

        // Regular Fibonacci series
        System.out.println("Regular Fibonacci series:");
        fibonacciRegular(n);

        // Fibonacci series in reverse order
        System.out.println("\nFibonacci series in reverse order:");
        fibonacciReverse(n);
    }

    // Regular Fibonacci series
    public static void fibonacciRegular(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " ");

        for (int i = 1; i < n; i++) {
            System.out.print(secondTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    // Fibonacci series in reverse order
    public static void fibonacciReverse(int n) {
        int[] fibonacciSeries = new int[n];

        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}
