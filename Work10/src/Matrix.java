import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Произведите ввод данных с клавиатуры в матрицу,
 * а после этого произведите вывод первой строки матрицы на экран,
 * где каждый элемент умножается на 3.
 * Размерность матрицы задается пользователем.
 */
public class Matrix {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int m, n;
            System.out.print("Введите количество строк матрицы: ");
            m = Integer.parseInt(reader.readLine());
            System.out.print("Введите количество столбцов матрицы: ");
            n = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[m][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print("Введите число: ");
                    matrix[j][i] = Integer.parseInt(reader.readLine());
                }
            }
            System.out.println("Первая строка матрицы:");
            for (int[] i : matrix) {
                System.out.print(i[0] * 3 + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
