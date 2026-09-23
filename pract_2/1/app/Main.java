package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Иванов И.И.", "AB123456");
        ElectricCar eCar = new ElectricCar("Петров П.П.", "CD654321", 75.0);

        // доступ к private-полям только через геттеры (напрямую car.ownerName отсюда не скомпилируется)
        System.out.println(car.getOwnerName() + " " + car.getInsuranceNumber() + " " + car.getEngineType());
        System.out.println(eCar.getOwnerName() + " " + eCar.getInsuranceNumber() + " "
                + eCar.getEngineType() + " " + eCar.getBatteryCapacity());

        // класс Main в пакете app - не в пакете vehicles и не наследник Car,
        // поэтому protected-поле engineType отсюда напрямую недоступно, только через геттер/сеттер:
        // car.engineType = "Diesel"; // ОШИБКА КОМПИЛЯЦИИ, если раскомментировать
        car.setEngineType("Diesel");

        car.setOwnerName("Сидоров С.С.");
        eCar.setBatteryCapacity(80.0);

        System.out.println(car.getOwnerName() + " " + car.getEngineType());
        System.out.println(eCar.getBatteryCapacity());
    }
}
