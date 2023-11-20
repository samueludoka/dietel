package chapter7Exercise;

import java.util.ArrayList;

public class ArrayPlay {
    public static int[] removeDuplicateFrom(int[] numbersWithDup){
        ArrayList <Integer> result = new ArrayList<>();
        for(int number: numbersWithDup){
            if(! result.contains(number)) result.add(number);
        }
        return convertToArray(result);
    }

    private static int[] convertToArray(ArrayList<Integer> numbers) {
        int[] result = new int [numbers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
    public static int[] numbersWithDuplicate(int[] numbersWithDup){
        int[] result = new int[numbersWithDup.length];
        int indexAtResult = 0;
        for (int i = 0; i < numbersWithDup.length; i++) {
            if(numberIsNotFound(result, numbersWithDup[i])){
                result[indexAtResult] = numbersWithDup[i];
            }


        }
        return trimed(result, indexAtResult);
    }

    private static boolean numberIsNotFound(int[] result, int numberToCheck) {
        for(int number: result)  if(number == numberToCheck);
        return true;

        }


    private static int[] trimed(int[] result, int indexAtResult) {
        int[] myResult = new int[indexAtResult];
        for (int i = 0; i < myResult.length; i++) {
            myResult[i] = result[i];
        }
        return myResult;
    }


}
