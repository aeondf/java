package app;

import geometry.Circle;
import geometry.Colorable;
import geometry.GeometricObject;
import geometry.IllegalTriangleException;
import geometry.Rectangle;
import geometry.Square;
import geometry.Triangle;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(2);
        objects[1] = new Circle(1.5);
        objects[2] = new Square();
        objects[3] = new Rectangle(3, 4);
        try {
            objects[4] = new Triangle(3, 4, 5);
        } catch (IllegalTriangleException e) {
            objects[4] = new Triangle(); // треугольник по умолчанию
        }

        for (GeometricObject object : objects) {
            System.out.printf("%s, площадь: %.2f%n", object, object.getArea());
            // howToColor() есть только у фигур, реализующих Colorable
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}
