public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
