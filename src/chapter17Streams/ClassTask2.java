package chapter17Streams;

import projectUser2.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassTask2 {
    public static void main(String[] args) {
        List <String> letter = List.of("Joy", "Qudus", "Ope", "Tobi", "Isreal");
        List<ClassTaskServer> user = letter.stream()
                .map(element -> new ClassTaskServer(element, element.length()))
                .collect(Collectors.toList());
        System.out.println(user);
    }
}
