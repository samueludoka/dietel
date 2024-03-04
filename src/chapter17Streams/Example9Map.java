package chapter17Streams;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example9Map {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100", "2", "30", "4", "5", "1");

        Map<String, Integer> map = numbers.stream()
                .collect(Collectors.toMap(
                        (element) -> element,
                        (element) -> element.length())); //        {"100" = 3, "2" = 1, "30" = 2...}

        System.out.println(map);


    }
}
