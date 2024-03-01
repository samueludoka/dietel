package chapter17Streams;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100","2","30","4","5","1");

//        Map<Integer, String> nums = numbers.stream()
//                                    .collect(Collectors.toSet());
//        System.out.println(nums);
    }
}
