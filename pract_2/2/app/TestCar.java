package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        // полиморфизм: ссылки типа Vehicle указывают на объекты Car и ElectricCar
        Vehicle car = new Car("Lada Vesta", "А123ВС777", "Белый", 2020, "Иванов И.И.", "AB123456");
        Vehicle eCar = new ElectricCar("Tesla Model 3", "Е777КХ777", "Чёрный", 2022,
                "Петров П.П.", "CD654321", 75.0);

        // изменение полей только через сеттеры (инкапсуляция)
        car.setColor("Красный");
        eCar.setOwnerName("Сидоров С.С.");
        ((ElectricCar) eCar).setBatteryCapacity(82.0); // batteryCapacity есть только у ElectricCar,
                                                        // поэтому нужно явное приведение типа

        System.out.println(car);
        System.out.println(eCar);
    }
}
