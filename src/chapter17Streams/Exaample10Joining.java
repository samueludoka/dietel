package chapter17Streams;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exaample10Joining {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100", "2", "30", "4", "5", "1");

       String result = numbers.stream()
                       .collect(Collectors.joining(",","(",")"));
        System.out.println(result);

    }
}
