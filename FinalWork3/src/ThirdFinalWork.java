import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Напишите программу конвертер валют.
 * Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class ThirdFinalWork {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            double rateOfUSD, amountOfRub;
            System.out.print("Введите текущий курс доллара: ");
            rateOfUSD = Double.parseDouble(reader.readLine());
            System.out.print("Введите количество рублей: ");
            amountOfRub = Double.parseDouble(reader.readLine());
            System.out.printf("Курс доллара = %.2f, Количество рублей: %.0f, Итого: %.2f долларов",
                    rateOfUSD, amountOfRub, amountOfRub / rateOfUSD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
