package flyweight;

// «приспособленец»: один объект на каждый цвет, общий для всех кругов этого цвета
public class Circle {
    // внутреннее (общее) состояние - хранится в объекте и не меняется
    private final String color;

    Circle(String color) { // создавать круги может только фабрика из этого же пакета
        this.color = color;
        System.out.println("  [создан новый объект Circle цвета «" + color + "»]");
    }

    public String getColor() {
        return color;
    }

    /** Внешнее (уникальное) состояние - координаты и радиус -
        передаётся при каждом вызове */
    public void draw(int x, int y, int radius) {
        System.out.println("Круг «" + color + "»: центр (" + x + ", " + y + "), радиус "
                + radius);
    }
}
