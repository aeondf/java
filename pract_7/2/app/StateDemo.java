package app;

import shop.Order;

public class StateDemo {
    public static void main(String[] args) {
        Order order = new Order("№1027");
        System.out.println("Статус: " + order.getStatus());

        // один и тот же вызов process() ведёт себя по-разному
        // в зависимости от состояния
        for (int i = 0; i < 4; i++) {
            order.process();
            System.out.println("Статус: " + order.getStatus());
        }

        // второй заказ живёт в своём состоянии независимо от первого
        Order second = new Order("№1028");
        second.process();
        System.out.println("\nЗаказ " + order.getNumber() + " - " + order.getStatus()
                + ", заказ " + second.getNumber() + " - " + second.getStatus());
    }
}
