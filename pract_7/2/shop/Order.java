package shop;

// контекст: заказ хранит текущее состояние и передаёт ему работу
public class Order {
    private final String number;
    private State state;

    public Order(String number) {
        this.number = number;
        this.state = new NewState(this); // любой заказ начинается с состояния «Новый»
    }

    public String getNumber() {
        return number;
    }

    // менять состояние могут только классы состояний этого пакета
    void setState(State state) {
        this.state = state;
    }

    public String getStatus() {
        return state.getName();
    }

    /** Обработать заказ: что именно произойдёт, решает текущее состояние */
    public void process() {
        state.handle();
    }
}
