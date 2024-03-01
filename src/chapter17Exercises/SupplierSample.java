package chapter17Exercises;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(9999);

//        Consumer<Integer> consumer = (number) -> System.out.println(number);
//        consumer.accept(supplier.get());


        System.out.println(supplier.get());
    }
}
