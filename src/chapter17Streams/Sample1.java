package chapter17Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Stream<Integer>stream =
                numbers.stream();
        stream.filter((number) -> number% 2 == 0).map((number) -> number * number).forEach(System.out::println);


        Stream.of(1,3,4,5,6,7,8).map((num) -> num * 2).forEach(System.out::println);

        Integer[] nums = {1,2,3,4,5};
        Arrays.stream(nums).map((num) -> num * 2).forEach(num -> System.out.println(num));

        Stream.generate(() -> new Random().nextInt()).limit(5).forEach((num) -> System.out.println(num));
    }
}
