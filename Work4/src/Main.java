import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число в бинарном виде:");
            int a = Integer.parseInt(reader.readLine(), 2);
            System.out.println("Вы ввели число: " + a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
