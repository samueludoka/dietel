package chapter6Exercises;

import java.util.ArrayList;

public class ArrayToOddEven {
    public static int[] oddEven(int[] input){
        int[] ans = new int[input.length];
        for (int count = 0; count < input.length; count++) {
            if(input[count]%2 == 0){
                input[count] = 0;
            } else if (input[count]%2 != 0) {
                input[count] = 1;

            }

        }

        return input;
    }
    public static boolean[] oddEvenBoolean(int[] ans){
        boolean[] num = new boolean[ans.length];
        for (int count = 0; count < num.length; count++) {
            if(ans[count]%2 == 0){
                num[count] = false;
            } else if (ans[count]%2 != 0) {
                num[count] = true;

            }

        }
        return num;
    }
    public static int[] inputArray(int[] input){
        int[] num = new int[input.length];
        int[] ans = new int[input.length * 2];
        int sum = 0;
        int count = 0;

        for (count = 0; count < input.length; count++) {
            sum = input[count] + input[count];
            ans[count] = input[count];
            ans[count+ input.length] = sum;
        }
        return ans;

    }
    public static int[] inputArray2(int[] input){
        int[] num = new int[input.length];
        int count = 0;

        for (count = 0; count < input.length; count++) {
           if(input[count]%2 == 0){
               input[count] = -1;
           } else if (input[count]%2 == 1) {
               input[count] = 0;

           }
        }
        return input;

    }
    public static int[] inputArray3(int[] score){
        int[] number = new int[score.length];
        for (int count = 0; count < score.length; count++) {
           if (score[count]%2 == 0){
               number[count] = score[count];
           }
        for (int counter = 0; counter < score.length-1; counter++){
            if(score[counter]%2 == 1){
                number[counter + score.length] = score[counter];
            }
        }


        }
        return number;
    }
}
