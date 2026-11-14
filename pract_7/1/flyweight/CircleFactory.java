package flyweight;

import java.util.HashMap;
import java.util.Map;

// фабрика приспособленцев: выдаёт уже созданный круг нужного цвета или создаёт новый
public class CircleFactory {
    private final Map<String, Circle> circles = new HashMap<>();

    public Circle getCircle(String color) {
        Circle circle = circles.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circles.put(color, circle);
        }
        return circle;
    }

    /** Сколько объектов Circle реально создано */
    public int getCreatedCount() {
        return circles.size();
    }
}
