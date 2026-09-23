public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public static final int CURRENT_YEAR = 2026;

    // конструктор по умолчанию
    public Car() {
        this.model = "Неизвестно";
        this.license = "Без номера";
        this.color = "Белый";
        this.year = CURRENT_YEAR;
    }

    // конструктор со всеми полями класса
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // конструктор по выбору: модель и год выпуска
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "Без номера";
        this.color = "Белый";
    }

    // геттеры
    public String getModel() { return model; }
    public String getLicense() { return license; }
    public String getColor() { return color; }
    public int getYear() { return year; }

    // сеттеры
    public void setModel(String model) { this.model = model; }
    public void setLicense(String license) { this.license = license; }
    public void setColor(String color) { this.color = color; }
    public void setYear(int year) { this.year = year; }

    // возраст автомобиля относительно текущего года
    public int getAge() {
        return CURRENT_YEAR - year;
    }

    // вывод характеристик автомобиля
    public void To_String() {
        System.out.println(model + " " + license + " " + color + " " + year);
    }
}
