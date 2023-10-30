package chapter7Exercise;

import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicateC17 {

    public static int[] findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int count = 0; count < nums.length; count++) {
            if (set.contains(nums[count])) {
                set.add(nums[count]);
            } else {
                set.add(nums[count]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);

        }

        return result;
    }

    public static boolean palindrome(String word) {
        String[] name = {"dad"};
        int count;
        int counter = 0;
        for (count = 0; count < counter; count++) {
            for (counter = 0; counter >= word.length(); counter++) {

            }
        }
        if (word.charAt(count) == word.charAt(counter))
            return true;
        else ;
        return false;

    }

    public static void main(String[] args) {
        String names = "madam";
        int count;
        int counter = 0;
        for (count = 0; count >= names.length(); count++) {
            for (counter = 0; counter < count; counter++) {

            }
        }
        if (names.charAt(count) == names.charAt(counter)) {
            System.out.println("True");
        } else {
            System.out.println("you r a big fool");
        }
    }


    public static int dominant(String scores) {
        String[] numb = {"9", "3", "10", "7", "4"};
        int[] dom;
        int dominant = 0;
        int count;
        int counter = 0;
        for (count = 0; count < scores.length(); count++) {
            for (counter = 0; counter < count; counter++) {

            }
        }
        if (scores.charAt(count) > scores.charAt(counter))


            return 0;
        return dominant;
    }

    public static int[] findDominantElement(int[] input) {
        int[] result = new int[input.length];
        for (int index = 0; index < input.length; index++) {
            int currentElement = input[index];
            for (int index2 = index+1; index2 < input.length; index2++) {
                if(currentElement < input[index2])break;
                if(index2==input.length-1)result[index] = currentElement;


            }

        }
        return null;
    }
    private static int[] removeZerosFrom(int[] numbers){
        int count = 0;
        for(int number:numbers){
            if(number != 0) count++;
        }
        int[] result = new int[count];
        count = 0;
        for (int index = 0; index < numbers.length; index++){
            if(numbers[index] != 0){
                result[count] = numbers[index];
                count++;
            }
        }
        return result;
    }
    public static boolean numberInBetweenIndices(int number, int num1, int num2, int target){
        String num = String.valueOf(number);
        int length = num.length();
        String indices = String.valueOf(num.charAt(num1));
        int value1 = Integer.parseInt(indices);
        String indices2 = String.valueOf(num.charAt(num2));
        int value2 = Integer.parseInt(indices2);
        return value1 <target && value2> target;
    }
}




