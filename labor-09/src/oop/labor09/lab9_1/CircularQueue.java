package oop.labor09.lab9_1;

import java.util.Arrays;
import java.util.Objects;

public class CircularQueue implements IQueue {
    private final int capacity;
    private Object[] items;
    private int rear, front;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.items = new Object[capacity];
        front = rear = -1;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return front == 0 && rear ==
                capacity - 1 || rear == front - 1;
    }

    @Override
    public void enQueue(Object item) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        items[rear] = item;
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty ");
            return;
        }
        System.out.println("The items of the queue:");
        int i = front;
        do {
            System.out.print(items[i] + " ");
            i = (i + 1) % capacity;
        } while (i != rear);
        System.out.println(items[i]);

    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            return null;
        }
        Object save = items[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return save;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if (rear == that.rear && front == that.front && Arrays.equals(items, that.items))
            return true;
        int i, j;
        for (i = this.front, j = that.front; i < this.rear && j < that.rear; i = (i + 1) % this.capacity, j = (j + 1) % that.capacity) {
            if (this.items[i] != that.items[j])
                return false;
        }
        return true;
    }
}
