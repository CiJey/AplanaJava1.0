import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Пользователь программы должен задавать размер массива и наполнять его числами.
 * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */
public class SecondFinalWork {

    private static void selectionSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("Неотсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (array[i] != array[minIndex]) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
        System.out.println("Отсортированный массив методом выбора:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("Неотсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (j > 0) {
                    if (array[i] <= array[j] & array[i] >= array[j - 1]) {
                        int tmp = array[i];
                        if (i - j >= 0)
                            System.arraycopy(array, j, array, j + 1, i - j);
                        array[j] = tmp;
                        break;
                    }
                } else {
                    if (array[i] < array[j]) {
                        int tmp = array[i];
                        System.arraycopy(array, j, array, j + 1, i - j);
                        array[j] = tmp;
                        break;
                    }
                }
            }
        }
        System.out.println("Отсортированный массив методом вставок:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void shellSort(int[] arr) {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("Неотсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int d = array.length / 2;
        while (d > 0) {
            for (int i = d; i < array.length; i++) {
                int j;
                int tmp = array[i];
                for (j = i; j >= d; j -= d) {
                    if (tmp < array[j - d])
                        array[j] = array[j - d];
                    else
                        break;
                }
                array[j] = tmp;
            }
            d /= 2;
        }

        System.out.println("Отсортированный массив методом Шелла:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] array, int low, int high) {
        int left = low, right = high;
        int p = array[(left + right) / 2];
        while (left <= right) {
            while (array[left] < p) {
                left++;
            }
            while (array[right] > p) {
                right--;
            }
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        if (low < right)
            quickSort(array, low, right);
        if (high > left)
            quickSort(array, left, high);
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size;
            int[] array;

            System.out.print("Введите размер массива: ");
            size = Integer.parseInt(reader.readLine());
            if (size <= 0) {
                System.out.println("Введен неверный размер массива!");
                System.exit(0);
            } else if (size == 1) {
                System.out.println("Массив отсортирован.");
                System.exit(0);
            }
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите число: ");
                array[i] = Integer.parseInt(reader.readLine());
            }

            while (true) {
                System.out.print("\nКаким методом выполнить сортровку?" +
                        "\n1 - сортировка выбором" +
                        "\n2 - сортировка вставками" +
                        "\n3 - быстрой сортировкой" +
                        "\n4 - методом Шелла" +
                        "\n5 - Выход из программы" +
                        "\nВведите номер: ");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1:
                        System.out.println("\nВыбрана сортировка методом выбора");
                        selectionSort(array);
                        break;
                    case 2:
                        System.out.println("\nВыбрана сортировка методом вставок");
                        insertionSort(array);
                        break;
                    case 3:
                        int[] arr = new int[array.length];
                        System.arraycopy(array, 0, arr, 0, array.length);
                        System.out.println("\nВыбран метод быстрой сортировки");
                        System.out.println("Неотсортированный массив:");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        quickSort(arr, 0, arr.length - 1);
                        System.out.println("\nОтсортированный массив быстрым методом:");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("\nВыбрана сортировка методом Шелла");
                        shellSort(array);
                        break;
                    case 5:
                        System.out.println("\nВыход из программы...");
                        System.exit(0);
                    default:
                        System.out.println("\nВы ввели неверный номер!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getRandom(int i) {
        return new Random().nextInt(i) + 5;
    }

    private static int getRandom() {
        return new Random().nextInt() / 1000000;
    }
}
