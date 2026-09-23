package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber) {
        // используем конструктор родителя Vehicle, двигатель по умолчанию - "Petrol"
        super(model, license, color, year, ownerName, insuranceNumber, "Petrol");
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
