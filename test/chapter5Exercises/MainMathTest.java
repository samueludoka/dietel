package chapter5Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainMathTest {
    @Test
    public void testThatSum1Exist() {
        int[] score = {5, 3, 4, 1, 2};
        int result = 15;
        int answer = MainMath.sumList(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatMaxExist() {
        int[] score = {5, 3, 4, 2, 1};
        int result = 5;
        int answer = MainMath.maxList(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatMinExist() {
        int[] score = {4, 3, 2, 1, 5};
        int result = 1;
        int answer = MainMath.minList(score);
        assertEquals(result, answer);

    }
    @Test
    public void testThatMinMaxExist(){
        int[] score = {4, 3, 2, 1, 5};
        int[] result = {14, 10};
        int[] answer = MainMath.minMax(score);
        assertArrayEquals(answer, result);
    }

//   public static void main(String[] args){
//        int[][] items = {{34, 23, 65},{23,67,44,68}};
//        for(int[] count: items){
//            System .out.println("\n");
//            for (int item : count) {
//                System.out.print(item+"\t");
//
//            }
//        }
//    }
}