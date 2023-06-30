package Basics.RandomNumberGenerator;

public class RandomNumber {
    private static long previous = System.currentTimeMillis();

    public static int generateRandomNumber() {
        long current = System.currentTimeMillis();
        long seed = previous * current;
        int random = (int) (seed % 100); // Generate a random number between 0 and 99
        previous = current;
        return random;
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Random Number: " + randomNumber);
    }
}

// currentTimeMillis. public static long currentTimeMillis() Returns the current
// time in milliseconds.