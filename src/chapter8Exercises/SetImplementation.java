package chapter8Exercises;

public class SetImplementation {
    private int size;
    private boolean isEmpty = true;
    private int[] sets = new int[10];

    public boolean isEmpty(){
        int count =0;
        for (int i = 0; i < sets.length; i++) {
            if (sets[i] != 0) count++;
        }
        if (count > 0) return true;
        return false;
    }


    public void add(int num) {
        this.sets = new int[]{num};
             size++;
    }
    public int getSize(){return size; }

    public String toString(){
        String result = "";
        for (int number: this.sets) {
            result += number+ ",";
        }
        return String.format("[" + result + "]");
    }
    public void remove(){
        size--;
    }


}
