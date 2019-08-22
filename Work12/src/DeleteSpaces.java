import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 */
public class DeleteSpaces {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            System.out.println("Введите строку:");
            string = reader.readLine().replaceAll(" ", "");
            System.out.println("Итоговая строка:\n" + string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
