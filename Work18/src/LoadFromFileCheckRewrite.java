import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class LoadFromFileCheckRewrite {

    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("test.txt"))) {
            List<String> list = new ArrayList<>();
            while (fileReader.ready()) {
                list.add(fileReader.readLine());
            }
            list.forEach(System.out::println);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("test.txt"));
            int i = 0;
            while (i < list.size()) {
                System.out.println("Введите строку:");
                fileWriter.write(reader.readLine());
                if (i != list.size() - 1)
                    fileWriter.write("\n");
                i++;
            }
            reader.close();
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
