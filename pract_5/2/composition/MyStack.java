package composition;

import java.util.ArrayList;

// стек через композицию: MyStack содержит список (отношение «имеет», has-a)
public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    /** Глубокая копия: у копии свой собственный список, а не ссылка на список оригинала */
    @Override
    public MyStack clone() {
        try {
            MyStack copy = (MyStack) super.clone(); // поверхностная копия: copy.list == list
            copy.list = new ArrayList<>(list);       // глубокая копия поля list
            return copy;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "стек: " + list;
    }
}
