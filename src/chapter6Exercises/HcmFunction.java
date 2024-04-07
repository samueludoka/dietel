package chapter6Exercises;

import java.util.ArrayList;

public class HcmFunction {
    public static boolean lcmMultiplication(int [] input){
        ArrayList<Integer> returns = new ArrayList<>();
        int count = 0;
        for(count = 3 ; count< input.length;){
            if(!ReturnBooleanIfDivisionIsTrue(input,count)){
                count++;
                continue;
            }
            input = multiplyNumber(input,count);
            returns.add(count);
        }
        return returns.add(count);
    }


    private static int[] multiplyNumber(int[] input, int count) {
        for(int counts = 0; counts < input.length; counts++){
            input[counts] = input[counts] * count;
        }
        return input;
    }

    private static boolean ReturnBooleanIfDivisionIsTrue(int[] input, int count) {
        for(int index = 0; index< input.length; index++){
            if(input[index]% count != 0)return false;
        }
        return true;
    }

    private static int max(int [] input){
        int max = input[0];
        for(int count = 1; count< input.length; count++){
            if(input[count] > max){
                max = input[count];
            }
        }
        return max;
    }
}

