package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.ElectricVehicle;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Lada Vesta", "А123ВС777", "Белый", 2020, "Иванов И.И.", "AB123456");
        ElectricCar eCar = new ElectricCar("Tesla Model 3", "Е777КХ777", "Чёрный", 2022,
                "Петров П.П.", "CD654321", 75.0);

        System.out.println("До изменений:");
        System.out.println(car);
        System.out.println(eCar);

        // изменение года выпуска и имени владельца
        car.setYear(2021);
        car.setOwnerName("Сидоров С.С.");
        eCar.setYear(2023);
        eCar.setOwnerName("Смирнова А.В.");

        // изменение страхового номера
        car.setInsuranceNumber("XX111111");
        eCar.setInsuranceNumber("YY222222");

        // получение ёмкости батареи через ссылку типа интерфейса ElectricVehicle
        ElectricVehicle ev = eCar;
        System.out.println("\nЁмкость батареи электромобиля: " + ev.getBatteryCapacity() + " кВт·ч");

        System.out.println("\nПосле изменений:");
        System.out.println(car);
        System.out.println(eCar);
    }
}
