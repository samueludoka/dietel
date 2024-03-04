package chapter17Streams;

import java.util.List;

public class ClassTask{

    public static void main(String[] args) {
        List<String> words = List.of("market", "Judge", "Bribe", "Education");
        var Letter = words.stream()
                            .mapToInt((number) -> number.length())
                            .sum();
        System.out.println(Letter);


//        List<String> letters = List.of(ClassTaskServer);

    }
}
