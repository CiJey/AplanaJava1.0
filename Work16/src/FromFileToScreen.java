import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */
public class FromFileToScreen {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("test.txt")))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()) {
                stringBuilder.append(reader.readLine()).append("\n");
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
