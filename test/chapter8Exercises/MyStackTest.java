package chapter8Exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test
    public void testStackIsEmpty(){
        MyStack newStack = new MyStack();
        assertTrue(newStack.isEmpty());
    }
    @Test
    public void addOneElementStackIsNotEmpty(){
        MyStack newStack = new MyStack();
        newStack.push("G string");
        assertFalse(newStack.isEmpty());
    }
    @Test
    public void pushOneAndPopOneElement(){
        MyStack newStack = new MyStack();
        newStack.push("G string");
        String popped = newStack.pop("G string");
        assertTrue(newStack.isEmpty());
    }
    @Test
    public void pushTwoElementAndPopOne(){
        MyStack newStack = new MyStack();
        newStack.push("G string");
        newStack.push("A string");
        String popped = newStack.pop("A string");
        assertFalse(newStack.isEmpty());
    }
    @Test
    public void pushThreeStringsAndGetThreeElements(){
        MyStack newStack = new MyStack();
        newStack.push("G string");
        newStack.push("A string");
        newStack.push("S string");
        assertEquals(3,newStack.size());
    }
    @Test
    public void pushOnePopOnePushedElementIsPopped(){
        MyStack newStack = new MyStack();
        newStack.push("G string");
        newStack.pop("G string");
        assertEquals(false,newStack.push("G string"));
    }
}