public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Kia Rio", "А123ВС777", "Чёрный", 2019);
        Car car2 = new Car("Kia Rio", "А123ВС777", "Чёрный", 2019);
        Car car3 = new Car("Lada Vesta", 2021);

        car1.setLicense("Н505НН");
        car1.setColor("Красный");

        car2.To_String();
        car3.To_String();

        System.out.println("Возраст car1: " + car1.getAge());
        System.out.println("Цвет car1: " + car1.getColor());
    }
}
