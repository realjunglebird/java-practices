public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(4);
        ComparableCircle circle2 = new ComparableCircle(6);
        Circle maxCircle = (circle1.compareTo(circle2) >= 0) ? circle1 : circle2;
        System.out.println("Наибольший круг: радиус = " + maxCircle.getRadius());

        GeometricObject rectangle = new Rectangle(5, 5);
        GeometricObject maxShape = (maxCircle.compareTo(rectangle) >= 0) ? maxCircle : rectangle;
        System.out.println("Наибольшая фигура: " + maxShape.toString());
    }
}
