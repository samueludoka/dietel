package chapter5Exercises;

public class DivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            if(i%3 == 0){
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
