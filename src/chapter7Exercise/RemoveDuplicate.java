package chapter7Exercise;

public class RemoveDuplicate {
    public int[] remove(int[] numbers) {

        String uniqueString = "";
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    numbers[j] = 0;
                }

            }

        }
        int length = countUniqueValues(numbers);
        numbers = stripArray(numbers, length);
        return numbers;

    }


    private int[] stripArray(int[] numbers, int length){
        int[] array = new int[length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0){
                array[count] = numbers[i];
                count++;
            }


        }
        return array;
    }
    private int countUniqueValues(int[] numbers){
        int length = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[1] != 0) {

            }

        }
        return length;
    }

}
