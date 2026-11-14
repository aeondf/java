package shop;

public class ShippedState implements State {
    private final Order order;

    public ShippedState(Order order) {
        this.order = order;
    }

    @Override
    public void handle() {
        System.out.println("Заказ " + order.getNumber()
                + ": курьер вручил заказ покупателю");
        order.setState(new DeliveredState(order));
    }

    @Override
    public String getName() {
        return "Shipped (отправлен)";
    }
}
