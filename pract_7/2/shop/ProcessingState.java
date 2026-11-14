package shop;

public class ProcessingState implements State {
    private final Order order;

    public ProcessingState(Order order) {
        this.order = order;
    }

    @Override
    public void handle() {
        System.out.println("Заказ " + order.getNumber()
                + ": собран и упакован, передаём в службу доставки");
        order.setState(new ShippedState(order));
    }

    @Override
    public String getName() {
        return "Processing (в обработке)";
    }
}
