import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с консоли число в бинарном формате.
 * Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * Необходимо использовать циклы, нельзя использовать готовые методы языка Java
 * для перевода числа из одной системы счисления в другую.
 */
public class FirstFinalWork {

    private static int binaryToDecimal(String s) {
        char[] arrayOfChars = s.toCharArray();
        int number = 0;

        for (int i = arrayOfChars.length - 1, degree = 0; i >= 0; i--, degree++) {
            if (arrayOfChars[i] == '1')
                number += Math.pow(2, degree);
        }
        return number;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            int number;

            System.out.print("Введите число в бинарном формате: ");
            s = reader.readLine().trim();
            if (s.matches("^[^-+].*[2-9\\D]+.*")) {
                throw new NumberFormatException("Неверный ввод!");
            } else {
                if (s.substring(1).matches(".*[2-9\\D]+.*")) {
                    throw new NumberFormatException("Неверный ввод!");
                } else if (s.charAt(0) == '-') {
                    number = -binaryToDecimal(s);
                } else {
                    number = binaryToDecimal(s);
                }
            }
            System.out.print("Введенное число в десятичной системе: " + number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
