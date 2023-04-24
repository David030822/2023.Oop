package oop.labor08.lab8_2;

public class Main {
    public static void main(String[] args) {
        StackInheritance stack = new StackInheritance(10);
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        System.out.println("Elements of the stack: ");
        stack.remove(0);
        while (!stack.isEmpty()) {
            System.out.print(stack.top() + " ");
            stack.pop();
        }
    }
}
