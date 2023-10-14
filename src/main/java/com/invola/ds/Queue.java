package com.invola.ds;

/** 
 * 
 * Q1.2: 
 * Give that each element has a priority ans we want to implementat MaxQueue, what would be changed, 
 * Assume that each elementat has a value property and q priorty property
 * I would create an internal type called QueueElement 
 * 
 * private final class QueueElement implements Comparable<QueueElement> {
 *      private int priorty; 
 *      private int value; 
 *     @override
 *     public int compareTo(QueueElement other) {...}
 * }
 * 
 * and I would use use / implement an array based max heap to store the elements in it 
 * 
 * Operation timing: 
 *  enqueue: O(logn)
 *  dqueue: O(logn) - dequeue means removal 
 *      we can have a method for example called front() without removal and it would be O(1)
 * 
 */

/**
 * Q1.1
 */
public class Queue {
    private static final int QUEUE_SIZE = 1000;
    private int head;
    private int tail;
    private int size;
    private int[] queue;

    public Queue() {
        size = 0;
        head = 0;
        tail = -1;
        queue = new int[QUEUE_SIZE];
    }

    /**
     * O(n) = 1;
     */
    public boolean enqueue(int value) {
        if (isFull())
            return false;

        tail = (tail + 1) % QUEUE_SIZE;
        queue[tail] = value;
        size += 1;

        return true;
    }

    /*
     * O(n) = 1;
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int answer = queue[head];
        head = (head + 1) % QUEUE_SIZE;
        size -= 1;
        return answer;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == QUEUE_SIZE;
    }

}
