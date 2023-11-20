package chapter8Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetImplementationTest {
    @Test
    public void TestThatSetExist(){
        SetImplementation mySet = new SetImplementation();
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void TestThatSetCanAddElement(){
        SetImplementation mySet = new SetImplementation();
        assertFalse(mySet.isEmpty());
        mySet.add(23);
        mySet.add(60);
        mySet.add(89);
        assertTrue(mySet.isEmpty());
        System.out.println(mySet);
    }
    @Test
    public void TestThatSetCanNotAddTheSameElement(){
        SetImplementation mySet = new SetImplementation();
        assertFalse(mySet.isEmpty());
        mySet.add(23);
        mySet.add(60);
        mySet.add(89);
        mySet.add(89);
        assertTrue(mySet.isEmpty());
        System.out.println(mySet);
    }

}