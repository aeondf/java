package delivery;

// «продукт» паттерна Factory Method: общий тип для всех заказов
public interface Order {
    String getDescription();
    int getDeliveryMinutes();
}
