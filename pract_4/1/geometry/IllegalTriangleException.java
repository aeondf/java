package geometry;

// собственное проверяемое исключение: стороны не образуют треугольник
public class IllegalTriangleException extends Exception {
    private final double side1;
    private final double side2;
    private final double side3;

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("стороны " + side1 + ", " + side2 + ", " + side3
                + " не образуют треугольник: сумма любых двух сторон должна быть больше третьей");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }
}
