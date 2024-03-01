package chapter17Streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(10, 20, 30),
                List.of(100, 200, 300),
                List.of(1000,2000,3000)
        );

        lists.stream() //[[10, 20, 30], [100,200,300], [1000,2000,3000]]
                .flatMap((list) -> list.stream())
                .forEach(num -> System.out.println(num));
//                .toArray();
//        System.out.println(lists);

    }
}
