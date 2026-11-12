package inheritance;

import java.util.ArrayList;

// стек через наследование: MyStack является списком (отношение is-a)
public class MyStack extends ArrayList<Object> {

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        return remove(size() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    // isEmpty() унаследован от ArrayList

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
