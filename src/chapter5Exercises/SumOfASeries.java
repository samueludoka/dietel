package chapter5Exercises;

public class SumOfASeries {
    public static void main(String[] args) {
        System.out.println(sumList());
    }
    public static int sumList(){
        int sum = 0;
        for (int count = 0; count < 100; count++) {
            sum += count;

        }
        return sum;
    }
}
