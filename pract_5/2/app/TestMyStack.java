package app;

import java.util.Scanner;
import inheritance.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            stack.push(sc.nextLine());
        }
        System.out.println(stack);

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
