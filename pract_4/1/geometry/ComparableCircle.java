package geometry;

// Comparable<GeometricObject> уже унаследован от GeometricObject,
// здесь он указан явно и метод compareTo() переопределён для кругов
public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Сравнимый круг: радиус = " + getRadius();
    }
}
