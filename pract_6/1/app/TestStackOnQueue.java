package app;

import stack.StackOnQueue;

public class TestStackOnQueue {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(1);
        stack.push(2);
        System.out.println("Добавлены 1 и 2: " + stack);

        System.out.println("top() - вершина без удаления: " + stack.top());
        System.out.println("pop() - вершина с удалением:  " + stack.pop());
        System.out.println("empty() - стек пуст? " + stack.empty());
        System.out.println("Все элементы стека: " + stack);
    }
}
