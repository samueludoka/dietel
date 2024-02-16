package chapter7Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatedArray {
    public static int returnNonDuplicateElement(int[] scores) {
        for (int count = 0; count < scores.length; count++) {
            for (int counter = 0; counter < scores.length; counter++) {
                if (scores[count] == scores[counter] && count != counter) {
                    scores[counter] = 0;
                    scores[count] = 0;
                }
            }
        }
        return getUniqueValue(scores);

    }

    private static int getUniqueValue(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != 0) return scores[i];
        }
        return 0;
    }

    public static int[] addOneToTheLastIndex(int[] scores) {
        int[] emptyArr = new int[scores.length];
        for (int count = 0; count < scores.length; count++) {
//            if(count == scores.length - 1) {
            if (scores[count] == +1) {
                int answer = scores[count] + 1;
                emptyArr[count] = answer;
                continue;
            }
            emptyArr[count] = scores[count];
        }
        System.out.println(Arrays.toString(emptyArr));
        return emptyArr;
    }

    public static int[] inputArr(int[] numbers) {
        int[] emptyArr = new int[numbers.length/2];
        int counter = 0;
        if(numbers.length%2 == 0) {

            for (int count = 0; count < numbers.length; count += 2){
                int ope = numbers[count] + numbers[count+1];
                emptyArr[counter]=ope;
                counter++;

            }


        }
        System.out.println(Arrays.toString(emptyArr));
        return emptyArr;
    }
    public static int [] inputArray(int [] number){
        int adds = 0;
        int counter = 0;
        int [] ad = new  int[number.length/2+1];
        for (int index = 0; index <number.length-2 ; index+=2) {
         adds =   number[index] + number[index +1 ] ;
         ad[counter] = adds;
         counter++;
        }
         ad[counter]= number.length-1;
        return ad;
    }
    public static int[] doubleArray(int[] scores, int[] num){
        int lowest = 0;
        int[] numb = {};
         for (int count = 0; count <scores.length ; count++) {
            for (int counter = 0; counter < num.length; counter++) {
                if(count == counter){
                    count = counter;
                }
                if(lowest == counter){
                    counter = lowest;
                }
                numb = new int[]{counter};
            }

        }
       return numb;
    }

}
