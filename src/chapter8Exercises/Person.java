package chapter8Exercises;

import java.lang.reflect.Type;
import java.util.List;

public class Person {
    private String name;
    private Type type;


    private List<Problems> problems;

    public void addProblem(String name, Type type){
        this.name = name;
        this.type = type;
    }

    }

