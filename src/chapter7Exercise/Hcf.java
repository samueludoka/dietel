package chapter7Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Hcf {
    public static int[] getFactors(int[] number) {
        int factorNumber = 1;
        int varArrayStoreID = 0;
        int[] factors = {};
        for (int count = 1; count <= number.length -1; count++) {

            varArrayStoreID = varArrayStoreID + 1;
            factors[varArrayStoreID] = factorNumber;
            factorNumber++;
        }
        System.out.println(Arrays.toString(factors));
        return factors;

    }



    public static Integer[] hcf(int [] input){
        ArrayList <Integer> returns = new ArrayList<>();
        int max = max(input);
        for(int count = 2 ; count< max;){
            if(!ReturnBooleanIfDivisionIsTrue(input,count)){
                count++;
                continue;
            }
           input = divideNumber(input,count);
            returns.add(count);
        }
        return returns.toArray(new Integer[0]);
    }


    private static int [] divideNumber(int[] input, int count) {
        for(int counts = 0; counts < input.length; counts++){
            input[counts] = input[counts] / count;
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
//        while(factorNumber != 0){
//            if(number % factorNumber == 0){
//                varArrayStoreID = varArrayStoreID + 1;
//                 factors[varArrayStoreID] = factorNumber;
//            }
//




