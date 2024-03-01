package chapter17Streams;

import java.util.List;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        List<String> phrases = List.of(
                "lasq_+","qewr90","bsmfhj56", "hfjjj7reyhs"
        );
        var result =
            phrases.stream()
                    .flatMap((phrase) -> phrase.chars().boxed())
                    .filter(c -> c >= 48 && c <= 57)
                    .count();

        System.out.println(result);
    }
}
