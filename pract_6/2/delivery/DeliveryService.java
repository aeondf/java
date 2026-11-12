package delivery;

// «создатель» паттерна Factory Method
public abstract class DeliveryService {

    /** Фабричный метод: какой именно заказ создать, решает подкласс */
    public abstract Order createOrder();

    /** Общий для всех служб алгоритм доставки;
        конкретный заказ получает от фабричного метода */
    public void deliver() {
        Order order = createOrder();
        System.out.println(getClass().getSimpleName() + ": доставляем "
                + order.getDescription() + ", ожидание около "
                + order.getDeliveryMinutes() + " мин.");
    }
}
