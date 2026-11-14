package shop;

public class DeliveredState implements State {
    private final Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void handle() {
        // конечное состояние: перехода нет
        System.out.println("Заказ " + order.getNumber()
                + ": уже доставлен, обрабатывать нечего");
    }

    @Override
    public String getName() {
        return "Delivered (доставлен)";
    }
}
