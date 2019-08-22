import java.io.*;

/**
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать,
 * какой принцип остановки записи в файл он должен подать.
 */
public class WriteToFile {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt", true))) {
            String s;
            while (true) {
                System.out.println("Введите строку, или Стоп для остановки ввода:");
                s = reader.readLine();
                if (s.equals("Стоп"))
                    break;
                writer.write(s);
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
