package app;

import java.util.Scanner;
import liststack.GenericStack;

public class TestListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите строку " + i + ": ");
            stack.push(sc.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
