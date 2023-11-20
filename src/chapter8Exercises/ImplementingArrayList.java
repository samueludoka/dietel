package chapter8Exercises;

public class ImplementingArrayList {
    private int size;
    private boolean isEmpty ;
    private int[] lists = new int[10];
    
    private int element;


    public boolean isEmpty(){
        if (size == 0) return true;
        else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void add(int element) {
        this.lists[size] = element;
        size++;
    }


    public int[] remove(int element) {
        int[] listes = new int[lists.length-1];
        for (int i = 0; i < lists.length; i++) {
            if(i == element){
                continue;
            }
            listes[i] = lists[i];

        }

        this.lists = listes;
        return lists;

    }
    

    public void set(int i, int element) {
        int[] num = new int[lists.length];
        for (int count = 0; count < lists.length; count++) {
            if(count == i){
                num[count] = element;
            }

        }
        this.lists = num;
    }

    public String toString(){
        String result = "";
        for (int number: this.lists) {
            result += number+ ",";
        }
        return String.format("[" + result + "]");
    }

    public boolean addAll() {
        int count =0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != 0) count++;
        }
        if (count > 0) return true;
        return false;

    }

    public boolean contain(int i) {
        int[] numb = new int[lists.length];
        for (int count = 0; count < lists.length; count++) {
            if(count == i){
                numb[count] = i;
            }
        }

        return false;
    }

}
