package chapter8Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class SetFunction {
    public static int[] sets(int[] number) {
        int[] element = new int[number.length];
        int[] newArray = new int[number.length];
        int counter = 1;
        for (int count = 0; count < number.length; count++) {
            if (count % 2 == 0) {
                newArray[counter] = number[count];
                counter += 2;
            }
        }
        counter = 0;
        for (int count = 0; count < number.length; count++) {
            if (count % 2 == 1) {
                newArray[counter] = number[count];
                counter += 2;
            }

        }
        return newArray;
    }

    public static int[] sets2(int[] number) {
        int x = number[2],y = number[3];
        number[3] = x;
        number[2] = y;
        return number;
    }
    public static int[] sets3(int[] number) {
        int x = number[4],y = number[5];
        number[5] = x;
        number[4] = y;
        return number;
    }
}
