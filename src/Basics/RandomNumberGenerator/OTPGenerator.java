package Basics.RandomNumberGenerator;

import java.util.Random;

public class OTPGenerator {
    private static final String OTP_CHARACTERS = "0123456789";
    private static final int OTP_LENGTH = 6;

    public static String generateOTP() {
        Random random = new Random();
        StringBuilder otpBuilder = new StringBuilder(); // StringBuilder for building the OTP string

        for (int i = 0; i < OTP_LENGTH; i++) {
            int randomIndex = random.nextInt(OTP_CHARACTERS.length()); // Generate a random index within the length of
                                                                       // OTP_CHARACTERS
            char otpChar = OTP_CHARACTERS.charAt(randomIndex); // Get the character at the random index from
                                                               // OTP_CHARACTERS
            otpBuilder.append(otpChar); // Append the character to the StringBuilder
        }

        return otpBuilder.toString(); // Convert the StringBuilder to a String and return the OTP
    }

    public static void main(String[] args) {
        String otp = generateOTP(); // Generate the OTP
        System.out.println("Generated OTP: " + otp); // Print the generated OTP
    }
}

// StringBuilder class can be used when you want to modify a string without
// creating a new object. For example, using the StringBuilder class can boost
// performance when concatenating many strings together in a loop.