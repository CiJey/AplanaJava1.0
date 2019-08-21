import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
 * Использовать циклы запрещено.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число");
            long number = Long.parseLong(reader.readLine());
            System.out.println(number);
            System.out.println(number << 1);
            System.out.println(number * 3);
            System.out.println(number << 2);
            System.out.println(number * 5);
            System.out.println(number * 6);
            System.out.println(number * 7);
            System.out.println(number << 3);
            System.out.println(number * 9);
            System.out.println(number * 10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
