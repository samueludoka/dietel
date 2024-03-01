package chapter17Exercises;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> word.length() > 2;

        System.out.println(predicate.test("NOT"));


        BiPredicate<String, String> biPredicate = (word, opposite) ->
                word.equals("beans") || opposite.equals("rice");
        System.out.println(biPredicate.test("beans", "rice"));


    }



}
