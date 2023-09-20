package chibuzosAssignment;

public class FunctionsWeekendSnacks {

    public static void main(String[] args) {
        isEven(56);
        isPrime(19);
        subtract(34,56);
        divide(56,34);
        factor(5);
        isSquare(5);
        isPalindrome(32123);
        factorial(5);
    }
    public static boolean isEven(int num) {
        if(num%2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int Number) {
        int number = 0;
        for (int count = 2;count < number;count --)
            if (number >= 1){
                return  true;
        }
        return false;
    }
    public static int subtract(int firstNumber,int secondNumber){
        int positiveDifference = firstNumber - secondNumber;
        int negativeDifference = -firstNumber -(-secondNumber);
        if(firstNumber > secondNumber){
            return positiveDifference;
        } else{
            return negativeDifference;
        }
    }
    public static double divide(int firstNumber,int secondNumber){
        double number = firstNumber / secondNumber;;
        if (number % 0  == 0){
        }

        return number;
    }
    public  static int factor(int number) {
        int factor = 1;
        for (int count = 1; count < number; count++) {
            if (number % count == 0)
                factor = factor + 1;
           }
       System.out.println(factor);
        return factor;
      }



    public static int isSquare(int number){
        int result = 0;
        result = number * number;


        return result;
    }

    public static boolean isPalindrome(int number) {
        boolean turnNumber = true;
        int change = 0;
        int numberChange = number;
        for (int count = 0; count <= number; count++) {
            int result = number % 10;
            change *= 10 +result;
            number /= 10;
        }


        if (numberChange == change) {
            return turnNumber;
        }else{
         return true;
        }
    }
    public static int factorial(int number){
        int fact = 5;
        for (int count = 5; count > number ; count--) {
            fact *= count;



        }
        return  fact;

    }

}

