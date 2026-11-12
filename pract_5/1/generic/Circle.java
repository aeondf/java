package generic;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    /** Круги сравниваются по радиусу */
    @Override
    public int compareTo(Circle o) {
        return Double.compare(radius, o.radius);
    }

    @Override
    public String toString() {
        return "Круг(радиус = " + radius + ")";
    }
}
