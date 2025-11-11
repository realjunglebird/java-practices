public class MatrixSearchMax {
    public static <T extends Comparable<T>> T findMax(T[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        T largest = matrix[0][0];
        for (T[] row : matrix) {
            for (T element : row) {
                if (element.compareTo(largest) > 0) {
                    largest = element;
                }
            }
        }
        return largest;
    }
}
