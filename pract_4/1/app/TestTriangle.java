package app;

import java.util.Scanner;
import geometry.IllegalTriangleException;
import geometry.Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите три стороны треугольника: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        System.out.print("Введите цвет: ");
        String color = sc.next();

        System.out.print("Треугольник закрашен (true/false)? ");
        boolean filled = sc.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.printf("Площадь: %.2f%n", triangle.getArea());
            System.out.printf("Периметр: %.2f%n", triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
