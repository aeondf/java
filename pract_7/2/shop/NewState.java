package shop;

public class NewState implements State {
    private final Order order;

    public NewState(Order order) {
        this.order = order;
    }

    @Override
    public void handle() {
        System.out.println("Заказ " + order.getNumber()
                + ": оплата получена, передаём на склад");
        order.setState(new ProcessingState(order));
    }

    @Override
    public String getName() {
        return "New (новый)";
    }
}
