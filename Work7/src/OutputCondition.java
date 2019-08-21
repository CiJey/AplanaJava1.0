import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
 * В программе должны присутствовать константы X, Y, Z.
 * Программа должна сравнивать введенное значение с клавиатуры со значением констант
 * и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
 * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */
public class OutputCondition {
    private static final int X = 10, Y = 20, Z = 30;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number;
            System.out.print("Введите число: ");
            number = Integer.parseInt(reader.readLine());
            switch (number) {
                case X:
                case Y:
                case Z:
                    System.out.println("Данное значение имеется в константах");
                    break;
                default:
                    System.out.println("Такой константы нет!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
