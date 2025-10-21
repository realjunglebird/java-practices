public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /** Создает по умолчанию заданный треугольник */
    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    /** Создает треугольник с указанными сторонами */
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 ||
            side1 + side3 <= side2 ||
            side2 + side3 <= side1
        ) {
            throw new IllegalTriangleException(
                    "Неправильные стороны треугольника: " + side1 + ", " +
                                                            side2 + ", " +
                                                            side3
            );
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Возвращает сторону 1 */
    public double getSide1() { return side1; }

    /** Возвращает сторону 2 */
    public double getSide2() { return side2; }

    /** Возвращает сторону 3 */
    public double getSide3() { return side3; }

    /** Возвращает площадь */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Возвращает периметр */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Возвращает информацию о треугольнике */
    @Override
    public String toString() {
        return "Треугольник: сторона 1 = " + side1 + "\n" +
                            "сторона 2 = " + side2 + "\n" +
                            "сторона 3 = " + side3 + "\n" +
                            super.toString();
    }
}
