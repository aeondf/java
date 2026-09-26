package app;

import geometry.Circle;
import geometry.GeometricObject;
import geometry.Rectangle;

public class TestMax {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3.5);
        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.printf("Наибольший из двух кругов: %s (площадь %.2f)%n", maxCircle, maxCircle.getArea());

        Rectangle rect1 = new Rectangle(3, 4);
        Rectangle rect2 = new Rectangle(5, 2);
        GeometricObject maxRect = GeometricObject.max(rect1, rect2);
        System.out.printf("Наибольший из двух прямоугольников: %s (площадь %.2f)%n", maxRect, maxRect.getArea());
    }
}
