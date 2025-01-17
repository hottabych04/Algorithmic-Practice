package com.hottabych04.example;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> queue = new Stack<>();
    private Stack<Integer> stack = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        queueToStack();
        stack.push(x);
    }

    public int pop() {
        stackToQueue();
        return queue.pop();
    }

    public int peek() {
        stackToQueue();
        return queue.peek();
    }

    public boolean empty() {
        return queue.empty() && stack.empty();
    }

    private void stackToQueue(){
        while (!stack.empty()){
            queue.push(stack.pop());
        }
    }

    private void queueToStack(){
        while (!queue.empty()){
            stack.push(queue.pop());
        }
    }
}
