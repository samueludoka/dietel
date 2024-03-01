package chapter17Exercises;

import java.util.HashMap;
import java.util.Map;

public class Sample2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
               map.put("one", 1);
               map.put("two", 2);
               map.put("three", 3);
               map.put("four", 4);


               map.forEach((word, number) -> System.out.println(number + " in words is  "+ word));
    }
}
