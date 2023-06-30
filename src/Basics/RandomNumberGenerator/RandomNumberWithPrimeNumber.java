package Basics.RandomNumberGenerator;

public class RandomNumberWithPrimeNumber {
    private static int seed = (int) System.currentTimeMillis();

    public static int generateRandomNumber() {
        int prime = 2147483647; // Largest prime number that fits in an int
        seed = (seed * 7) % prime;
        return seed;
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Random Number: " + randomNumber);
    }
}
