package delivery;

public class PizzaDelivery extends DeliveryService {
    private final String pizza;
    private final int diameter;

    public PizzaDelivery(String pizza, int diameter) {
        this.pizza = pizza;
        this.diameter = diameter;
    }

    @Override
    public Order createOrder() {
        return new PizzaOrder(pizza, diameter);
    }
}
