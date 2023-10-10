package chapter7Exercise;

public class ElementSwap {
    public static int[] replace(int[] numbers,int numberOne,int numberTwo ) {
        numbers[numberOne] = numbers[numberOne] + numbers[numberTwo];
        numbers[numberTwo] = numbers[numberOne] - numbers[numberTwo];
        numbers[numberOne] = numbers[numberOne] - numbers[numberTwo];


        return numbers;
    }
}
