import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Необходимо написать программу, которая будет реализовывать следующие действия:
 * 1. Ввод числа с клавиатуры и запись его в строковую переменную S
 *
 * 2. Конвертация строковой переменной S в числовую переменную X типа int
 *
 * 3. Конвертация числа X типа int в число Y типа double
 *
 *
 * Все три числа разных типов необходимо в столбик вывести на экран
 */
public class TypeConversion {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S;
            int X;
            double Y;

            System.out.print("Введите число: ");
            S = reader.readLine();
            X = Integer.parseInt(S);
            Y = X;
            System.out.println("String:  " + S + "\nInteger: " + X + "\nDouble:  " + Y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
