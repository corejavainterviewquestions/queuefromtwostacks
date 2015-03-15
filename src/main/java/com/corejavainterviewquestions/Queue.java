package com.corejavainterviewquestions;


import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue {
    Stack<String> stackOne = new Stack();
    Stack<String> stackTwo = new Stack();

    public void add(String item) {
        stackOne.push(item);
    }

    public String remove() {
        if(stackOne.isEmpty() && stackTwo.isEmpty())
            throw new NoSuchElementException("The Queue Is Empty");

        if(stackTwo.isEmpty())
            while(!stackOne.isEmpty()) stackTwo.push(stackOne.pop());

        return stackTwo.pop();
    }

}
