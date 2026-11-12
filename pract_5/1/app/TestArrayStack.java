package app;

import arraystack.GenericStack;

public class TestArrayStack {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        System.out.println("Пустой стек, вместимость массива: " + stack.getCapacity());

        for (int i = 1; i <= 9; i++) {
            stack.push(i * 10);
            System.out.println("push(" + i * 10 + ") -> размер " + stack.getSize()
                    + ", вместимость " + stack.getCapacity());
        }
        System.out.println(stack);

        System.out.println("peek(): " + stack.peek());
        System.out.println("pop():  " + stack.pop());
        System.out.println("pop():  " + stack.pop());
        System.out.println(stack + ", размер " + stack.getSize());
    }
}
