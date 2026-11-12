package arraystack;

import java.util.EmptyStackException;

// обобщённый стек на основе массива
public class GenericStack<E> {
    private static final int INITIAL_CAPACITY = 4;

    private E[] elements;
    private int size; // количество элементов в стеке

    @SuppressWarnings("unchecked")
    public GenericStack() {
        // new E[...] написать нельзя, поэтому создаём Object[] и приводим к E[]
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    /** Текущая вместимость массива (для наблюдения за его расширением) */
    public int getCapacity() {
        return elements.length;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public void push(E o) {
        if (size == elements.length) { // массив заполнен
            @SuppressWarnings("unchecked")
            E[] newElements = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = o;
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        E o = elements[size];
        elements[size] = null; // убираем ссылку, чтобы не держать объект в памяти
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elements[i]);
        }
        return sb.append("]").toString();
    }
}
