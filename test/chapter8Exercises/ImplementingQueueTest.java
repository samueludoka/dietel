package chapter8Exercises;

import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ImplementingQueueTest {
    @Test
    public void testQueueExist(){
        ImplementingQueue myQueue = new ImplementingQueue();
        assertTrue(myQueue.isEmpty());
        System.out.println(myQueue);

    }
    @Test
    public void testQueueCanAddAnElement(){
        ImplementingQueue myQueue = new ImplementingQueue();
        assertTrue(myQueue.isEmpty());
        myQueue.add(23);
        myQueue.add(55);
        myQueue.add(20);
        myQueue.add(45);
        assertFalse(myQueue.isEmpty());
        System.out.println(myQueue);
    }
    @Test
    public void testQueueCanRemoveAnElement(){
        ImplementingQueue myQueue = new ImplementingQueue();
        assertTrue(myQueue.isEmpty());
        myQueue.add(23);
        myQueue.add(55);
        myQueue.add(20);
        myQueue.add(45);
        myQueue.remove(45);
        assertEquals(45, myQueue.remove(45));
        System.out.println(myQueue);
    }

}