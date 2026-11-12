package delivery;

import java.util.List;

public class GroceryOrder implements Order {
    private final List<String> products;

    public GroceryOrder(List<String> products) {
        this.products = products;
    }

    @Override
    public String getDescription() {
        return "продукты: " + String.join(", ", products);
    }

    @Override
    public int getDeliveryMinutes() {
        return 90;
    }
}
