package vehicles;

public class Car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Car(String ownerName, String insuranceNumber) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Petrol"; // значение по умолчанию для обычного автомобиля
    }

    // геттеры и сеттеры для private-полей
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    // геттер и сеттер для protected-поля
    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }
}
