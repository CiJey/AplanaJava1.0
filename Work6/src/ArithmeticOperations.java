import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Написать программу, которая будет выполнять следующие действия:
 *
 * 1. Ввод трех чисел с клавиатуры x, y, z
 *
 * 2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
 *
 * 3. Деление среднего арифметического на 2 без остатка
 *
 * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 *
 */
public class ArithmeticOperations {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            double x, y, z, avg;
            System.out.print("Введите число x: ");
            x = Double.parseDouble(reader.readLine());
            System.out.print("Введите число y: ");
            y = Double.parseDouble(reader.readLine());
            System.out.print("Введите число z: ");
            z = Double.parseDouble(reader.readLine());

            System.out.println("Среднее арифметическое: " + (avg = (x + y + z) / 3));
            avg = (long) avg / 2;
            System.out.println(avg);
            if (avg > 3)
                System.out.println("Программа выполнена корректно");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
