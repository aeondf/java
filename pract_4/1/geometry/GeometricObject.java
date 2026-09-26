package geometry;

import java.util.Date;

// абстрактный класс: общие свойства всех фигур, объект GeometricObject создать нельзя
public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Создает геометрический объект по умолчанию */
    protected GeometricObject() {
        dateCreated = new Date();
    }

    /** Создает геометрический объект с указанным цветом и заливкой */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public Date getDateCreated() { return dateCreated; }

    // площадь и периметр каждая фигура считает по-своему
    public abstract double getArea();
    public abstract double getPerimeter();

    /** Сравнивает фигуры по площади */
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }

    /** Возвращает наибольший из двух объектов */
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    @Override
    public String toString() {
        return "создан " + dateCreated + ", цвет: " + color + ", заливка: " + filled;
    }
}
