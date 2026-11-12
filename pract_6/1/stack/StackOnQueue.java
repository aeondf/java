package stack;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

// стек (LIFO) на двух очередях (FIFO); очереди - поля класса (композиция)
public class StackOnQueue {
    // элементы стека: голова очереди - вершина стека
    private Queue<Integer> main = new ArrayDeque<>();
    // вспомогательная очередь, нужна только внутри push
    private Queue<Integer> temp = new ArrayDeque<>();

    /** Помещает элемент x на вершину стека */
    public void push(int x) {
        // новый элемент первым встаёт во вспомогательную очередь,
        // за ним переходят все старые элементы
        temp.add(x);
        while (!main.isEmpty()) {
            temp.add(main.poll());
        }
        // меняем очереди местами: temp снова пустая
        Queue<Integer> swap = main;
        main = temp;
        temp = swap;
    }

    /** Удаляет элемент на вершине стека и возвращает его */
    public int pop() {
        if (empty()) {
            throw new NoSuchElementException("стек пуст");
        }
        return main.poll();
    }

    /** Возвращает элемент на вершине стека, не удаляя его */
    public int top() {
        if (empty()) {
            throw new NoSuchElementException("стек пуст");
        }
        return main.peek();
    }

    /** Возвращает true, если стек пуст */
    public boolean empty() {
        return main.isEmpty();
    }

    /** Элементы от вершины к основанию; очередь прокручивается по кругу
        и возвращается в исходный вид */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек (вершина слева): [");
        int n = main.size();
        for (int i = 0; i < n; i++) {
            int x = main.poll();
            sb.append(x);
            if (i < n - 1) {
                sb.append(", ");
            }
            main.add(x);
        }
        return sb.append("]").toString();
    }
}
