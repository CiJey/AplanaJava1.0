import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
 * Результат вывести на экран.
 */
public class StringInput {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            System.out.println("Введите строку: ");
            string = reader.readLine();
            System.out.println("Введенная строка: \n" + string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
