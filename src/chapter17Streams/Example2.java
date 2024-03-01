package chapter17Streams;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        Integer result = List.of("orange", "mango", "Banana", "Guava")
                .stream()
                .mapToInt((num) -> num.length())//[5,6,6,5]
                .sum();
        System.out.println(result);
    }

}
