package shop;

// состояние заказа: от него зависит, что делает заказ при обработке
public interface State {
    void handle();
    String getName();
}
