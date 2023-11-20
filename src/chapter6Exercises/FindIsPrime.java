package chapter6Exercises;

public class FindIsPrime {
    public static int isPrime(int number) {
        if(number % 2 == 0) {
            System.out.println("It is not a prime number");
            return number;
        }
        else {
            int count = 3;
            while(count <= Math.sqrt(number) ) {
                if( (number % count) == 0) {
                    System.out.println("It is not a prime number");
                }
                count = count + 2;
            }
        }
        return number;
    }
}
