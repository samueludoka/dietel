package assignment;

public class Factorial {
    public static void main(String[] args) {
        int sum = 1;
        for (int count = 5; count > 1; count--) {
            sum = sum * count;
        }
        System.out.print(sum);
    }
}
