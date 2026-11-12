package delivery;

import java.util.List;

public class GroceryDelivery extends DeliveryService {
    private final List<String> products;

    public GroceryDelivery(List<String> products) {
        this.products = products;
    }

    @Override
    public Order createOrder() {
        return new GroceryOrder(products);
    }
}
