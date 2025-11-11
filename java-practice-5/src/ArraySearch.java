public class ArraySearch {
    public static <T> int linearSearch(T[] array, T key) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
