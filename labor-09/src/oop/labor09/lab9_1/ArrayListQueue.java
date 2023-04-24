package oop.labor09.lab9_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private final int capacity;
    private ArrayList<Object> items = new ArrayList<>();

    public ArrayListQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == capacity;
    }

    @Override
    public void enQueue(Object item) {
        if (!isFull()) {
            items.add(item);
        }
    }

    @Override
    public Object deQueue() {
        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }
}
