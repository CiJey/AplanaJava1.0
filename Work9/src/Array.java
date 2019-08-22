import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 * где каждый элемент массива умножается на 2.
 * Размер массива задается пользователем.
 */
public class Array {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size;
            System.out.print("Введите размер массива: ");
            size = Integer.parseInt(reader.readLine());
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите число: ");
                array[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println("Итоговый массив:");
            for (int i : array) {
                System.out.print(i * 2 + " ");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
