/**
 * Необходимо написать программу для сортировки данных массива по возрастанию.
 * Использовать пузырьковый метод сортировки.
 */
public class Sorting {

    public static void main(String[] args) {
        int[] array = new int[]{ 1, 5, 9, 3, 6, 8, 7, 2, 4 };

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
