package chapter8Exercises;

public class MyStack {

    private boolean isEmpty = true;
    private int size;
    private String[] elements = new String[5];
    public MyStack(){
        int defaultSize = 5;
        elements = new String[defaultSize];
    }


    public boolean isEmpty(){
        if (size == 0) return true;
        return false;
    }

    public boolean push(String element) {
//        if(size == 0) firstElement = element;
        size++;
        return isEmpty = false;
    }

    public String pop(String element) {
        size--;
        return elements[size];
    }

    public int size() {
        return size++;
    }
}
