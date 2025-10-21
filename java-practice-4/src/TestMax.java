public class TestMax {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(3, "красный", false);
        GeometricObject circle2 = new Circle(5, "синий", true);
        System.out.println("Наибольший круг: " + GeometricObject.max(circle1, circle2).toString());

        GeometricObject rectangle1 = new Rectangle(2, 4, "зелёный", false);
        GeometricObject rectangle2 = new Rectangle(3, 3, "жёлтый", true);
        System.out.println("Наибольший прямоугольник: " + GeometricObject.max(rectangle1, rectangle2).toString());
    }
}
