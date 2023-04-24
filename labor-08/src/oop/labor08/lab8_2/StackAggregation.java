package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackAggregation {
    private int capacity;
    private ArrayList<Object> items = new ArrayList<>();

    public StackAggregation(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return items.size() == capacity;
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public void push(Object item) {
        if (items.size() < capacity) {
            items.add(item);
            return;
        }
        System.out.println("tele a verem");

    }

    public void pop() {
        if (!isEmpty()) {
            items.remove(items.size() - 1);
        }
    }

    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }
}
