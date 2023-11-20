package chapter8Exercises;

public class ImplementingQueue {
    private int[] queue;
    private int size;
    private int rearOrTail;

    private int frontOrHead;


    public int[] getQueue() {
        return queue;
    }

    public int getSize() {
        return size;
    }

    public int getRearOrTail() {
        return rearOrTail;
    }

    public int getFrontOrHead() {
        return frontOrHead;
    }



    public boolean isEmpty() {
        boolean res = false;
        if (size == 0) {
            res = true;
        }
        return res;
    }

    public void add(int element) {
        size++;


    }

    public int remove(int element) {
        int response = 0;
        if (size != 0){
            frontOrHead++;
            response = queue[frontOrHead + 1];
            size--;
        }
        return response;
    }
//        int[] queues = new int[queue.length];
//        for (int count = 0; count < queue.length; count++) {
//            if(count == 0){
//                queues[count] = element;
//            }
//
//        }
//        this.queue = queues;
//        return queues;

}
