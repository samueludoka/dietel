package chapter7Assignment;

import java.util.Arrays;

public class ArrayFunction {

    public static void main(String[] args) {
        int[] integar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(totalOfList(integar)));
    }

    public static int listLargestNumber(int[] scores) {
        int largestNumber = 0;
        for (int count = 0; count < scores.length; count++) {
            if (scores[count] > largestNumber) {
                largestNumber = scores[count];
            }
        }
        return largestNumber;
    }

    public static int[] reverseAList(int[] scores) {
        int[] convert = new int[scores.length];
        int numb = 0;
        int count;
        for (count = scores.length - 1; count >= 0; count--) {
            convert[numb] = scores[count];
            numb++;
        }
        return convert;
    }

    public static int[] oddNumbersInAList(int[] scores) {
        int[] odd = new int[scores.length / 2];
        int count;
        int num = 0;
        for (count = 1; count <= scores.length; count += 2) {
            odd[num] = scores[count];
            num++;

        }
        return odd;
    }

    public static int[] evenNumbersInAList(int[] scores) {
        int[] score = new int[scores.length];
        int num = 0;
        int[] even;
        if (score.length % 2 != 0) {
            even = new int[scores.length / 2 + 1];
        } else {
            even = new int[score.length / 2];
        }
        num = 0;
        for (int count = 0; count < scores.length; count += 2) {
            even[num] = scores[count];
            num++;
        }

        return even;
    }

    public static int[] elementExistInAList(int[] scores) {
        int[] element = new int[scores.length];
        int[] element2 = {3};

        return element2;
    }

    public static int[] runningTotal(int[] scores) {
        int[] score = new int[scores.length];
        int sum = 0;
        for (int count = 0; count < 10; count++) {
            sum = sum + count;


        }
        return new int[]{sum};
    }

    public static boolean stringPalindrome(String palindrome) {
        int j = 0;
        int i;
        for (i = 0; i < j; i++) {
            for (j = 0; j >= palindrome.length(); j++) {
            }
        }
        if (palindrome.charAt(i) == palindrome.charAt(j))
            return true;
        else ;

        return false;

    }

    public static int[] totalOfList(int[] scores) {
        int[] values = new int[scores.length];
        int total = 0;
        for (int count = 0; count < scores.length; count++) {
            total = total + count;



        }

        return new int[]{total};
    }
    public static int[] totalOfList2(int[] scores) {
        int[] values = new int[scores.length];
        int total = 0;

        int count = 0;
        while (count < scores.length) {
            count++;
            total = total + count;
        }
        return new int[]{total};
    }
    public static int[] totalOfList3(int[] scores){
        int[] values = new int[scores.length];

        int total = 0;
        int count = 0;
        do{
            count ++;
            total = total + count;
        }while (count < scores.length);

        return new int[]{total};
    }
    public static String[] concatenate(int[] scores, String[] scores1){
        int value = scores1.length;
        String [] newArray = new String[scores.length+scores1.length];
        for (int count = 0; count < newArray.length; count++) {
            for(int counter = 0; counter < scores.length;counter++){
                if(count == counter){
                    newArray[count] = String.valueOf(scores[counter]);

            }
            }
        }
        for(int count = 0;count < scores1.length;count++){
            newArray[value] =  scores1[count];
            value++;
        }
        return newArray;

    }
    public static String[] combineTwoLists(int[] scores, String [] scores1){
        String [] array = new String[scores.length + scores1.length];
        int first = 0;
        for (int number = 0; number < scores1.length; number++){
            array[first] = scores1[number];
            first += 2;
        }
        int second = 1;
        for (int number = 0; number < scores.length; number++){
            array[second] = String.valueOf(scores[number]);
            if (second < array.length - 2) second += 2;
            else second++;
        }
        return array;
    }

}
