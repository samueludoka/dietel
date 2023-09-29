package ScoreTask;

public class task4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int count = 0; count <= 10; count++) {
            if (count %2 == 0){
                sum = sum + count;
            }

        }
        System.out.println(sum);

    }
}
