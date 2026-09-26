package vehicles;

// интерфейс описывает, что должен уметь любой электромобиль
public interface ElectricVehicle {
    double getBatteryCapacity();
    void setBatteryCapacity(double batteryCapacity);
}
