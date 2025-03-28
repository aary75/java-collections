package com.bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Constructor to initialize two queues
    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation: Add an element to the stack
    public void push(int x) {
        // Always enqueue new element to queue1
        queue1.add(x);
    }

    // Pop operation: Remove the top element from the stack
    public int pop() {
        // If queue1 is empty, return -1 (or throw exception)
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements from queue1 to queue2, except the last one
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last remaining element in queue1 is the top of the stack
        int topElement = queue1.poll();

        // Swap the names of queue1 and queue2 to reset for the next operation
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Top operation: Get the top element of the stack without removing it
    public int top() {
        // If queue1 is empty, return -1 (or throw exception)
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements from queue1 to queue2, except the last one
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last remaining element in queue1 is the top of the stack
        int topElement = queue1.peek();

        // Move the element back to queue1
        queue2.add(queue1.poll());

        // Swap the names of queue1 and queue2 to reset for the next operation
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Test the stack operations
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());  // Should print 3
        System.out.println("Top: " + stack.top());  // Should print 2
        System.out.println("Pop: " + stack.pop());  // Should print 2
        System.out.println("Is empty? " + stack.isEmpty());  // Should print false
        System.out.println("Pop: " + stack.pop());  // Should print 1
        System.out.println("Is empty? " + stack.isEmpty());  // Should print true
    }
}

