package chapter17Exercises;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleSample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = new LongToDoubleFunction() {
            @Override
            public double applyAsDouble(long value) {
                return 0;
            }
        };
    }
}
