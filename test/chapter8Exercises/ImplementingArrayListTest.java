package chapter8Exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ImplementingArrayListTest {
    @Test
    public void newArrayListIsEmpty(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
    }
    @Test
    public void newArrayListCanAddOneItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(1);
        assertFalse(myList.isEmpty());
        System.out.println(myList);
    }
    @Test
    public void newArrayListCanAddMoreThanOneItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        assertFalse(myList.isEmpty());
        System.out.println(myList);
    }
    @Test
    public void newArrayListCanRemoveAnItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(50);
        myList.add(20);
        myList.add(3);
        myList.remove(2);
        assertFalse(myList.isEmpty());
        System.out.println(myList);
    }
    @Test
    public void newArrayListCanSetAnItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.set(1,50);
        assertFalse(myList.isEmpty());
        System.out.println(myList);
    }
    @Test
    public void newArrayListAddAllItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.addAll();
        assertFalse(myList.isEmpty());
        System.out.println(myList);
    }
    @Test
    public void newArrayListContainAnItem(){
        ImplementingArrayList myList = new ImplementingArrayList();
        assertTrue(myList.isEmpty());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.contain(5);
        assertFalse(myList.contain(5));
        System.out.println(myList);
    }


}