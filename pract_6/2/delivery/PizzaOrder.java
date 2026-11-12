package delivery;

public class PizzaOrder implements Order {
    private final String pizza;
    private final int diameter;

    public PizzaOrder(String pizza, int diameter) {
        this.pizza = pizza;
        this.diameter = diameter;
    }

    @Override
    public String getDescription() {
        return "пицца «" + pizza + "», " + diameter + " см";
    }

    @Override
    public int getDeliveryMinutes() {
        return 40;
    }
}
