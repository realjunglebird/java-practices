public class Task11 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 5};
        insertionSort(array);
        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];     // текущий вставляемый элемент
            int j = i -1;           // индекс предыдущего элемента

            // сдвигаем элементы, которые больше
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];    // перемещаем элемент вправо
                j--;                        // переходим к следующему элементу слева
            }

            array[j + 1] = key;     // вставляем key на найденное место
        }
    }
}
