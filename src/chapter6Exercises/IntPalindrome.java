package chapter6Exercises;

public class IntPalindrome {
    public static int isIntPalindrome(int number) {
        int value = 0;
        int rdigits = number;
        while (number != 0) {
            int pop = number % 10;
            value = value * 10 + pop;
            number = number / 10;
            if (value == rdigits
            ) {
                System.out.println("number is palindrome");
            } else {
                System.out.println("number isn't a palindrome bitch ass nigga");
            }
        }
        return value;
    }
}
