package app;

import composition.MyStack;

public class TestClone {
    public static void main(String[] args) {
        MyStack original = new MyStack();
        original.push("первый");
        original.push("второй");

        MyStack copy = original.clone();
        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + copy);
        System.out.println("original == copy: " + (original == copy));

        // меняем только копию
        copy.push("третий");
        copy.pop();
        copy.pop();
        copy.push("новый");

        System.out.println("\nПосле изменения копии:");
        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + copy);
    }
}
