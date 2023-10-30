package chapter5Exercises;

public class DivisbleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 0; count <= 30; count++) {
            if(count % 3 == 0){
                sum += count;
            }

        }
        System.out.println("sum is" + sum);
    }
}
