package liststack;

import java.util.ArrayList;

// обобщённый стек, унаследованный от ArrayList (отношение «является», is-a)
public class GenericStack<E> extends ArrayList<E> {

    public int getSize() {
        return size();
    }

    public E peek() {
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        return remove(size() - 1);
    }

    // isEmpty() не пишем: он уже унаследован от ArrayList

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
