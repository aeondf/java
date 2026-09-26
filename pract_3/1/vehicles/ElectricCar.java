package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private double batteryCapacity;

    public ElectricCar(String model, String license, String color, int year,
                       String ownerName, String insuranceNumber, double batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.engineType = "Electric"; // protected-поле, унаследованное от Vehicle через Car
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    // реализация методов интерфейса ElectricVehicle
    @Override
    public double getBatteryCapacity() { return batteryCapacity; }

    @Override
    public void setBatteryCapacity(double batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    @Override
    public String toString() {
        return super.toString() + ", батарея " + batteryCapacity + " кВт·ч";
    }
}
