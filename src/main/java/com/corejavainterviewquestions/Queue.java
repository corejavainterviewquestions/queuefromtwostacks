package com.corejavainterviewquestions;


import java.util.Stack;

public class Queue {
    Stack<String> stackOne = new Stack();

    public void add(String item) {
        stackOne.push(item);
    }

    public String remove() {
        String result = null;
        while(!stackOne.isEmpty())
            result = stackOne.pop();

        return result;
    }
}
