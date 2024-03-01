package chapter17Exercises;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (name, state)->{
            System.out.println("My name is "+name+ "and am from"+state);

        };
        biConsumer.accept("joy","gombe");
    }
}
