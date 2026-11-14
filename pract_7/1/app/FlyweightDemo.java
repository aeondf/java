package app;

import java.util.Random;
import flyweight.Circle;
import flyweight.CircleFactory;

public class FlyweightDemo {
    public static void main(String[] args) {
        String[] colors = {"красный", "зелёный", "синий"};
        CircleFactory factory = new CircleFactory();
        // фиксированное зерно - одинаковый вывод при каждом запуске
        Random random = new Random(27);

        int drawn = 12;
        for (int i = 0; i < drawn; i++) {
            Circle circle = factory.getCircle(colors[random.nextInt(colors.length)]);
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            circle.draw(x, y, 5 + random.nextInt(20));
        }

        System.out.println("\nНарисовано кругов: " + drawn);
        System.out.println("Создано объектов Circle: " + factory.getCreatedCount());

        Circle a = factory.getCircle("красный");
        Circle b = factory.getCircle("красный");
        System.out.println("Два запроса красного круга вернули один объект: "
                + (a == b));
    }
}
