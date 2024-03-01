package chapter17Exercises;

import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {
    DoubleSupplier doubleSupplier = new DoubleSupplier() {
        @Override
        public double getAsDouble() {
            return 0;
        }
    };
}
