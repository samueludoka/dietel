package chapter16exercises;

import chapter15Exercises.bank.Transaction;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add("john");

        list.add(new Transaction("","",""));
    }
}
