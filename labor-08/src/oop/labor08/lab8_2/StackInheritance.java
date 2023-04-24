package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object item) {
        if (this.size() < capacity) {
            this.add(item);
            return;
        }
        System.out.println("tele verem");
    }

    public void pop() {
        if (!this.isEmpty()) {
            this.remove(this.size() - 1);
        }
    }

    public Object top() {
        if (!this.isEmpty()) {
            return this.get(this.size() - 1);
        }
        return null;
    }

    public int getSize() {
        return this.size();
    }

    public boolean isFull() {
        return this.size() == capacity;
    }
}
