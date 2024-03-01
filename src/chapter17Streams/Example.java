package chapter17Streams;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        String result = List.of(10, 20, 30, 40)
                .stream() //[10,20,30,40]
                .map(String::valueOf) //["10","20","30,"40"]
//                .reduce((x,y) -> x.concat(y))
//                .orElseThrow();
//                .reduce("", (x,y) -> x.concat(y));//"10203040"
                .reduce("", (x,y) -> x+y); // "100"

        /**
         * .reduce:
         * "10" + "20" == "1020"
         * "1020" + "30" == "102030"
         * "102030" + "40" == "10203040"
         * identity "" contains the first element of reduce
         * sum is not a method of the generic stream interface instead its in interface int stream
         */

        System.out.println(result);
    }
}
