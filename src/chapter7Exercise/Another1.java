package chapter7Exercise;

public class Another1 {
    public static void main(String[] args) {

    }

    public static int oddPosition(int[] list) {
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int sum = 0;
        for (int i = 1; i < newArray.length; i += 2) {
            sum = sum + list[i];

        }

        return sum;
    }

    public static int evenPosition(int[] list) {
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int sum = 0;
        for (int i = 0; i < newArray.length; i += 2) {
            sum = sum + newArray[i];

        }
        return sum;
    }

    public static int sumOfOddNumber(int[] list) {
        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (list[i] % 2 == 1) {
                sum = sum + newArray[i];

            }

        }
        return sum;
    }

    public static int sumOfEvenNumber(int[] list) {
//        int[] newArray = {5, 4, 1, 0, 6, 7, 4};
        int sum = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                sum = sum + list[i];

            }

        }
        return sum;
    }
}
