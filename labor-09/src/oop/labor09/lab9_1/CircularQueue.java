package oop.labor09.lab9_1;

public class CircularQueue implements IQueue{
    private final int capacity;
    private Object[] items = {};
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void enQueue(Object item) {

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}
