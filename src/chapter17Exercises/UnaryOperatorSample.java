package chapter17Exercises;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> operator = (word) -> new StringBuilder(word).reverse().toString();
        System.out.println(operator.apply("Hello"));

        BinaryOperator<String> binaryOperator = (word, letter)-> String.valueOf(new StringBuilder(word).compareTo(new StringBuilder(letter)));
        System.out.println(binaryOperator.apply("word", "letter"));
    }
}
