package com.corejavainterviewquestions;


import java.util.Stack;

public class Queue {
    Stack<String> stackOne = new Stack();
    Stack<String> stackTwo = new Stack();

    public void add(String item) {
        stackOne.push(item);
    }

    public String remove() {
        while(!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
        String result = stackTwo.pop();

        while(!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
        return result;
    }
}
