import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Необходимо провести сравнение длины двух строк,
 * которые были введены с клавиатуры и записаны в соответствующие переменные.
 * Вывести на экран строку с наибольшей длиной.
 * Если длины равны, вывести соответствтующее сообщение.
 */
public class StringComparison {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String first, second;
            System.out.println("Введите первую строку:");
            first = reader.readLine();
            System.out.println("Введите вторую строку:");
            second = reader.readLine();

            if (first.length() > second.length())
                System.out.println("Строка с наибольшей длиной:\n" + first);
            else if(first.length() < second.length())
                System.out.println("Строка с наибольшей длиной:\n" + second);
            else
                System.out.println("Длины строк равны.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
