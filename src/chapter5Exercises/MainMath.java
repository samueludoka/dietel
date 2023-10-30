package chapter5Exercises;

public class MainMath {


    public static int sumList(int[] scores) {
        int[] number = new int[scores.length];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum;
    }

    public static int minList(int[] scores) {
        int[] number = new int[scores.length];
        int min =scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] < min)   min = scores[i];
        }
        return min;
    }

    public static int maxList(int[] scores) {
        int[] number = new int[scores.length];
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max)  max = scores[i];

        }
        return max;
    }

    public static int[] minMax(int[] scores){
        int sum = sumList(scores);
        int max = maxList(scores);
        int min = minList(scores);
        return new int[]{sum - min, sum - max};
    }
}



