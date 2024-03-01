package chapter17Exercises;

public class Consumer {
    public static void main(String[] args) {
//        consumer is a functional interface and is a generic type
        java.util.function.Consumer<String> consumer = (word) -> {
            System.out.println(word + " is having a great day without lunch");
        };
        consumer.accept("john");


    }
}
