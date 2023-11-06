package chapter6Exercises;

public class SumOfDigit {

    public static int sumDigit(int number){
        int result = 0;

        while (number != 0){
            int lol = number % 10;
            number = number / 10;
            result += lol;
        }

        return result;
    }
}
