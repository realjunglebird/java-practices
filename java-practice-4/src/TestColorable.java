public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] arr = {
                new Circle(2),
                new Rectangle(2,3),
                new Square(5),
                new Circle(1.5),
                new Square(3)
        };

        for (GeometricObject obj : arr) {
            System.out.println(obj.toString());
            System.out.println("Area = " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable)obj).howToColor();
            }
        }
    }
}
