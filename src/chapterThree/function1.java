package chapterThree;

public class function1 {
    public static int power(int number, int power){
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;

        }
        return result;
    }
}

