package vehicles;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, double batteryCapacity) {
        super(ownerName, insuranceNumber);
        this.engineType = "Electric"; // прямой доступ к protected-полю родителя (Car в том же пакете)
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }
}
