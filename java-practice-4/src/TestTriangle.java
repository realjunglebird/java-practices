import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) throws IllegalTriangleException {
        double a, b, c;
        boolean fill;
        String color;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину стороны 1: ");
        a = scanner.nextDouble();
        System.out.print("Введите длину стороны 2: ");
        b = scanner.nextDouble();
        System.out.print("Введите длину стороны 3: ");
        c = scanner.nextDouble();
        System.out.print("Укажите, делать ли заливку: ");
        fill = scanner.nextBoolean();
        System.out.print("Укажите цвет треугольника: ");
        color = scanner.next();

        try {
            Triangle triangle = new Triangle(a, b, c);
            triangle.setColor(color);
            triangle.setFilled(fill);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Заливка: " + triangle.isFilled());
        }
        catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
}
