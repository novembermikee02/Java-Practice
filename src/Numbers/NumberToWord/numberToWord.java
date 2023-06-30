package Numbers.NumberToWord;

import java.util.Scanner;

public class numberToWord {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            return "minus " + convertNumberToWord(Math.abs(number));
        }

        String word = "";

        if ((number / 1000000) > 0) {
            word += convertNumberToWord(number / 1000000) + " million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            word += convertNumberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            word += convertNumberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                word += units[number];
            } else {
                word += tens[number / 10] + " " + units[number % 10];
            }
        }

        return word.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String word = convertNumberToWord(number);
        System.out.println(number + " = " + word);
    }
}
