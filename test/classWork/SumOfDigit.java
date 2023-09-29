package classWork;

public class SumOfDigit {
    public static void main(String[] args) {
        sumDigits(324);
        
    }

    public static int sumDigits(int number) {
        int value = 0;
        int sum = 0;
        for (int count = 1; count != 0 ; count++) {
            if(count > 0) {
                value = number % 10;
                sum = sum + value;
                number = number / 10;

            }else{
                value = number % 10;
                sum = sum  -(-(value));
                number = number / 10;

            }
        }
        return sum;
    }

}
