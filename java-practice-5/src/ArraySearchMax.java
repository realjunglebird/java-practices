class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
}

public class ArraySearchMax {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T largest = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i].compareTo(largest) > 0) {
                largest = array[i];
            }
        }
        return largest;
    }
}
