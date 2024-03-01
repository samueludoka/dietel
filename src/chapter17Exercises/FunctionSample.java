package chapter17Exercises;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, Integer> function = (lugubrious)->lugubrious.length();
        System.out.println(function.apply("lugubrious"));

        BiFunction<String, String, Integer> biFunction = (lugubrious, lux)->lux.length();
        System.out.println(function.apply("lux"));
    }
}
