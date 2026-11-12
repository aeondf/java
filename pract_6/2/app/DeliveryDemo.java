package app;

import java.util.List;
import delivery.DeliveryService;
import delivery.GroceryDelivery;
import delivery.Order;
import delivery.PizzaDelivery;

public class DeliveryDemo {
    public static void main(String[] args) {
        // клиент работает только с абстрактными типами DeliveryService и Order
        DeliveryService[] services = {
                new PizzaDelivery("Маргарита", 30),
                new GroceryDelivery(List.of("молоко", "хлеб", "яблоки")),
                new PizzaDelivery("Пепперони", 40)
        };

        for (DeliveryService service : services) {
            service.deliver();
        }

        // фабричный метод можно вызвать и напрямую
        Order order = new GroceryDelivery(List.of("кофе")).createOrder();
        System.out.println("\nСоздан заказ: " + order.getDescription()
                + " (класс " + order.getClass().getSimpleName() + ")");
    }
}
