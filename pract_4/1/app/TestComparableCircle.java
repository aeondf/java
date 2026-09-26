package app;

import geometry.ComparableCircle;
import geometry.GeometricObject;
import geometry.Rectangle;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(4.5);

        // compareTo() > 0 - первый больше, < 0 - второй больше, 0 - равны
        GeometricObject bigger = circle1.compareTo(circle2) >= 0 ? circle1 : circle2;
        System.out.printf("Наибольший из двух кругов: %s (площадь %.2f)%n", bigger, bigger.getArea());

        Rectangle rect = new Rectangle(10, 6);
        bigger = circle2.compareTo(rect) >= 0 ? circle2 : rect;
        System.out.printf("Наибольший между кругом и прямоугольником: %s (площадь %.2f)%n",
                bigger, bigger.getArea());
    }
}
